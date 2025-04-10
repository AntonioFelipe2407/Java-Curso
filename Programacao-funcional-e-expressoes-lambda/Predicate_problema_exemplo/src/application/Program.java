package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Mouse", 90.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Pendrive", 30.95));
        list.add(new Product("Tablet", 340.50));

        /*
        dentro do metodo removeIf é chamada uma referência para
        o metodo estatico dentro da classe Product
         */
        list.removeIf(Product :: staticProductPredicate);

        list.forEach(System.out::println);
    }
}
