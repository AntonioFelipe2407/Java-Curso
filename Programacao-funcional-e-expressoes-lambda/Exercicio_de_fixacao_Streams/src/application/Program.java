package application;

import entities.Employee;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Usuário digita o caminho do arquivo
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        // Criando e escrevendo um arquivo.csv
        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            // Cria lista que irá armazenar os funcionários que serão lidos do arquivo
            List<Employee> list = new ArrayList<>();

            //Lê a primeira linha
            String line = br.readLine();

            //Lê todas as linhas do arquivo, enquanto houver conteúdo
            while(line != null){
                //Divide a linha em campos separados por vírgulas e cria um objeto Employee
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));

                //Lê a próxima linha do arquivo
                line = br.readLine();
            }

            // Usuário digita um salário
            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();

            /* Cria uma pipeline para selecionar os emails dos funcionários
            cujo o salário é superior ao salário informado pelo usuário */
            List<String> emails = list.stream() // Cria um stream a partir da lista
                    .filter(x -> x.getSalary() > sal) // Filtra funcionários com o salário superior ao informado
                    .map(x -> x.getEmail())// Extrai os emails dos funcionários
                    .sorted((e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase())) // Ordena os emails em ordem crescente
                    .collect(Collectors.toList()); // Transforma em lista novamente

            // Imprime os emails
            System.out.printf("Email of people whose salary is more than %.2f:\n", sal);
            emails.forEach(System.out::println);

            // Calcula a soma dos salários dos funcionários cujo a primeira letra começa com 'M'
            double sum = list.stream() // Cria um stream a partir de uma lista
                    .filter(x -> x.getName().charAt(0) == 'M') // Filtra os funcionários cujo o nome começa com 'M'
                    .map(x -> x.getSalary()) // Extrai os salários dos funcionários
                    .reduce(0.0, (x,y) -> x + y); // Soma o salário dos funcionários
            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f\n", sum); // Imprime a soma

        } catch (IOException e) {
            // Captura e trata erros relacionados ao acesso ou leitura do arquivo
            System.out.println("Error: " + e.getMessage());
        }
        // Fecha o Scanner
        sc.close();
    }
}
