package util;

import entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    /*
    metodo testa os produtos maiores ou iguais a 100 e retorna um bool
     */
    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
