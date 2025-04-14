package application;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando e escrevendo um arquivo.csv
        try(BufferedWriter br = new BufferedWriter(new FileWriter("arquivo.csv"))){
            System.out.println("Arquivo liberado para escrita (digite 'Sair' para finalizar): ");

            while(true){
                String line = sc.nextLine();

                if (line.equalsIgnoreCase("Sair")){
                    break;
                }
                br.write(line);
                br.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
