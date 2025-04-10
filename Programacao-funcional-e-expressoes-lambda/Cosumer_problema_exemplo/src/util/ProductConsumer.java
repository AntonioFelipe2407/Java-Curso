package util;

import entities.Product;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Product> {


    //Metodo da interface que altera o preço aumentando em 10%
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
