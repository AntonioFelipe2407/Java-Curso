package util;

import entities.Product;

import java.util.function.Function;

public class ProductFunction implements Function<Product, String> {

    //metodo que deixa o nome em letras maiúsculas
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
