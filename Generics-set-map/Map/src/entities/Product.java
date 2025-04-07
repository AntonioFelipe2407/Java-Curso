package entities;

import java.util.Objects;

public class Product {
    //Atributes
    private String name;
    private Double price;

    //Constructor
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //Gatters and Setters
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

    //HashCode and Equals
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

    //Sobrescrevendo o metodo toString com o StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: "+ name + "\n");
        sb.append(" price: " + String.format("%.2f", price) + "\n");
        sb.append("Stock");

        return sb.toString();
    }
}
