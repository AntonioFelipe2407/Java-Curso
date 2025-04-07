package entities;

import java.util.Objects;

public class Product implements Comparable<Product> { // implementando a interface comparable
    private String name;
    private Double price;

    //Constructor
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //gatters and setters
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

    //HashCode e Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    //tostring
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //sobrepondo o metodo compareTo
    @Override
    public int compareTo(Product other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase()); // compara o nome
    }
}
