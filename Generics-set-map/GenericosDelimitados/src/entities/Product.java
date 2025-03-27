package entities;

import java.util.List;
/*
 para que o metodo max funcione é necessário dizer
 que a classe implementa a classe comparable
 */
public class Product implements Comparable<Product> {
    String name;
    Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Product other) { // sobrescrevendo o metodo da classe comparable
        return price.compareTo(other.getPrice()); // compara o produto com outro produto do argumento e retorna o maior
    }
}
