package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("maria", "maria@gmail.com");
        Client c2 = new Client("moreira", "moreira@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        String ss1 = new String("Test");
        String ss2 = new String("Test");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        System.out.println(c1 == c2); // retorna false pois compara a referencia de memória
        System.out.println(s1 == s2); // retorna true pois o compilador da um tratamento especiais para literais
        System.out.println(ss1 == ss2); // retorna false por nao ser literal
    }
}
