package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Usuário digita o caminho do arquivo
        System.out.println("Digite o caminho do arquivo: ");
        String path = sc.nextLine();

        // Abre o arquivo para leitura utilizando o BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            //Cria uma lista que irá armazenar os produtos que serão lidos do arquivo
            List<Product> list = new ArrayList<>();

            // Lê a primeira linha
            String line = br.readLine();

            // Lê todas as linhas do arquivo, enquanto houver conteúdo
            while (line != null) {
                // Divide a linha em campos separados por vírgulas e cria um objeto Product
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));

                //Lê a próxima linha do arquivo
                line = br.readLine();
            }

            // Calcula a média dos preços utilizando uma pipeline de Stream
            double avg = list.stream() // Cria um stream a partir da lista
                    .map(p -> p.getPrice())// Mapeia para obter somente os preços dos produtos
                    .reduce(0.0, (x, y) -> x + y) / list.size(); // Soma os preços e divide pelo número de produtos
            System.out.printf("Avarage price: %.2f\n", avg); // Imprime a média dos preços

            // Define um comparador para ordenar os nomes dos produtos em ordem crescente
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            //Cria uma pipeline para selecionar nomes de produtos cujo o preço é inferior à média e ordená-los em ordem decrescente
            List<String> names = list.stream() //Cria um stream a partir da lista
                    .filter(p -> p.getPrice() < avg)// Filtra produtos com preço abaixo da média
                    .map(p -> p.getName())// Extrai os nomes dos produtos
                    .sorted(comp.reversed()) // Ordena os nomes em ordem decrescente
                    .collect(Collectors.toList()); // Transforma o stream em lista novamente

            // Imprime os nomes dos produtos resultantes
            names.forEach(System.out ::println);

        } catch (IOException e) {
            // Captura e trata erros relacionados ao acesso ou leitura do arquivo
            System.out.println("Error: " + e.getMessage());

        }
        // Fecha o Scanner
        sc.close();
    }
}
