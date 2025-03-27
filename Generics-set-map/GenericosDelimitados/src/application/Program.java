package application;

import entities.Product;
import service.CalcService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // formatar double para "."

        List<Product> list = new ArrayList<>(); // lista do tipo product
        String sourceFileStr = "meuArquivo.txt"; // caminho do arquivo

        //Verifica se o arquivo foi encontrado
        File file = new File(sourceFileStr);
        if (!file.exists()) {
            System.out.println("Arquivo não encontrado no caminho especificado!");
        } else {
            System.out.println("Arquivo encontrado");
        }

        //Abre o arquivo para leitura
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

            String line = br.readLine();// le a primeira linha
            while (line != null) {
                String[] fields = line.split(","); // pega a linha e quebra baseado no split e armazena no vetor
                list.add(new Product(fields[0], Double.parseDouble(fields[1]))); // add a linha a lista
                line = br.readLine(); // le a prox linha
            }
            System.out.println("File reader sucess!"); // informa que o arquivo foi lido com sucesso

        } catch (Exception e) { //exception
            throw new RuntimeException("nao leu");
        }
        Product x = CalcService.max(list); // chama a função que retorna o maior valor
        System.out.println("Most expensive:");
        System.out.println(x); // mostra o maior valor

    }
}
