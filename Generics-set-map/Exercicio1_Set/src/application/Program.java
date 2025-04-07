package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the full path of the file: "); // digite o caminho completo do arquivo
        String path = sc.nextLine(); // armazena o caminho do arquivo que o usuário digitou

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // abre o arquivo para leitura

            Set<LogEntry> set = new HashSet<>(); // Crio um conjunto HashSet para armazenar as linhas

            String line = br.readLine(); // le a primeira linha

            while (line != null) { // enquanto a linha for diferente de nulo executa o bloco
                String[] fields = line.split(" "); // cria um vetor que armazena os elementos da linha separados por espaço
                String userName = fields[0]; // armazena o nome
                Instant moment = Instant.parse(fields[1]); // armazena a data

                set.add(new LogEntry(userName, moment)); // adiciona ao conjunto a primeira linha
                line = br.readLine(); // le a proxima linha
            }

            System.out.println("Total users: " + set.size()); // exibe a quantidade de userName presentes no conjunto (Não aceita repetiçao)

        } catch (Exception e) { // exception
            throw new RuntimeException(e);
        }
        sc.close(); // fecha Scanner

    }
}
