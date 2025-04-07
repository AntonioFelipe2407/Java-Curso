package application;

import entities.Product;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        /*
        Quando se utiliza o TreeSet, é necessário que a sua classe
        implemente a interface Comparable, para seja possível que o TreeSet
        consiga ordenar os seus objetos
         */
        Set<Product> set = new TreeSet<>();
        set.add(new Product("computer", 1500.0));
        set.add(new Product("banana", 245.0));
        set.add(new Product("tablet", 3000.0));

        for (Product p : set) {
            System.out.println(p);
        }


    }
}
