package application;

import entities.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 3000.00));
        list.add(new Product("Iphone", 5000.00));
        list.add(new Product("Tablet", 1050.40));
        list.add(new Product("Telefone", 234.23));

        // Instanciação da classe ProductService para utilizar seus métodos
        ProductService ps = new ProductService();

        // Calcula a soma dos preços dos produtos cujo mo,e começa com a letra 'T'
        // A condição é definida utilizando uma expressão lambda que verifica a primeira letra do nome
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println(sum);


    }
}
