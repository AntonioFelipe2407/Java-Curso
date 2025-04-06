package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        //HashSet
        Set<String> set1 = new HashSet<>();
        set1.add("TV");
        set1.add("Notebook");
        set1.add("Tablet");

        System.out.println(set1.contains("TV")); // verifica se "TV" está continda no conjunto
        for (String s1 : set1) {
            System.out.println(s1); // Exibe o conjunto
        }

        //TreeSet
        Set<String> set2 = new TreeSet<>();
        set2.add("Batata");
        set2.add("Abobora");
        set2.add("Cenoura");
        set2.add("Tablet");

        System.out.println();
        System.out.println(set2.contains("Batata"));
        for (String s2 : set2) {
            System.out.println(s2);
        }

        //LinkedHashSet
        Set<String> set3 = new LinkedHashSet<>();
        set3.add("Blusa");
        set3.add("Calça");
        set3.add("Tênis");

        System.out.println();
        System.out.println(set3.contains("Blusa"));
        System.out.println(set3); // exibe o conjunto

        System.out.println();

        // Testando operações
        set1.remove("Notebook"); // remove o elemento
        set3.removeIf(x -> x.charAt(4) == 'a'); // remove todos que tem 'a' na quarta posiçao

        //union
        Set<String> uni = new TreeSet<>(set1); // passa uma cópia do conjunto set1
        uni.addAll(set2); // une os conjuntos "uni" com o conjunto "set2"
        System.out.println(uni);

        // intersection
        Set<String> inter = new TreeSet<>(set1); // passa uma cópia do conjunto set1
        inter.retainAll(set2); // remove do conjunto os elementos não contidos em other
        System.out.println(inter);

        //diference
        Set<String> dif = new TreeSet<>(set1); // recebe a copia de set1
        dif.removeAll(set2); // remove do conjunto os elementos contidos em other
        System.out.println(dif);

    }
}
