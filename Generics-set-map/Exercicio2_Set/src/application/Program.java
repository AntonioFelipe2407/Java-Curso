package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>(); // conjunto da turma A
        Set<Integer> b = new HashSet<>(); // conjunto da turma B
        Set<Integer> c = new HashSet<>(); // conjunto da turma C

        System.out.print("How many students for course A?: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            int id = sc.nextInt();
            a.add(id); // add o código do aluno ao conjunto "a"
        }

        System.out.print("How many students for course B?: ");
         n = sc.nextInt();
        for (int i = 0; i<n; i++){
            int id = sc.nextInt();
            b.add(id); // add o código do aluno ao conjunto "b"
        }

        System.out.print("How many students for course C?: ");
         n = sc.nextInt();
        for (int i = 0; i<n; i++){
            int id = sc.nextInt();
            c.add(id); // add o código do aluno ao conjunto "c"
        }

        Set<Integer> total = new HashSet<>(a); // instancia um conjunto com os elementos do conjunto "a"
        total.addAll(b); // adiciona todos os elementos de "b" para "total"
        total.addAll(c); // adiciona todos os elementos de "c" para "total"

        System.out.println("Total students: " + total.size()); // exibe a quantidade de elementos do conjunto

        sc.close();
    }
}
