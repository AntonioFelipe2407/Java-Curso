package application;

import service.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService(); //variavel ps do tipo PrintService Integer

        System.out.print("Quantos valores deseja preencher? ");
        int n = sc.nextInt();

        for (int i=0; i < n; i++){
            Integer value = sc.nextInt();
            ps.add(value); // adiciona o valor digitado a lista
        }

        ps.print(); // chama a funcao que printa os valores
        Integer x = ps.first(); // x recebe o resultado da funcao que exibe o primeiro valor
        System.out.println("First: " + x); // exibe o primeiro valor

        sc.close(); // fecha o scanner
    }
}
