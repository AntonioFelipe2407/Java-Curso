package application;

import entities.Product;
import util.ProductConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 990.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 500.76));
        list.add(new Product("Mouse", 30.0));

        /*
        dentro do metodo forEach é chamado diretamente a expressão lambda
        */
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        /* passando um reference method para
         o metodo println para imprimir a lista
        */
        list.forEach(System.out::println);

    }
}
