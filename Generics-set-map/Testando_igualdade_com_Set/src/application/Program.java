package application;

import entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();
        set.add(new Product("TV", 1500.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 2000.0));

        Product prod = new Product("Notebook", 1200.0);

        /* se o hashcode e equals não estivesse implementado, retornaria um false pois
           por padrão ele compara as referências (ponteiros) dos objetos*/
        System.out.println(set.contains(prod)); // retorna true
    }
}
