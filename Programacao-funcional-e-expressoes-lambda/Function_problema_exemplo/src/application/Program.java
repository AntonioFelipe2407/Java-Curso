package application;

import entities.Product;
import util.ProductFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("Notebook", 1200.0));

        /*
        A list é convetida para stream, onde o map
        aplica o metodo para cada valor da coleção, e após isso
        a stream é convetida para Lista novamente e sendo atribuída
        a uma nova Lista do tipo String
         */
        List<String> names =  list.stream().map(new ProductFunction()).collect(Collectors.toList());
        names.forEach(System.out::println); // imprime a nova lista




    }
}
