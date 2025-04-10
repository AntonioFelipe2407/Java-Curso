package application;

import entities.Product;
import util.ProductConsumer;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 990.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 500.76));
        list.add(new Product("Mouse", 30.0));

        /*
         dentro do forEach é feito um reference method para
         a classe que está o metodo NÃO estático, portanto,
         o forEach irá percorrer a lista aplicando a lógica implementada no metodo
          */
        list.forEach(Product::nonStaticProductConsumer);

        /* passando um reference method para
         o metodo println para imprimir a lista
        */
        list.forEach(System.out::println);

    }
}
