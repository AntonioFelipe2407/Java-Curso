package application;

import entities.Product;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Instanciando um Map com a chave do tipo Product e o valor Double
        Map<Product, Double> stock = new HashMap<>();

        // Instanciando objetos Product
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        // Adicionando elementos (chave, valor) ao Map
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        // Verificando se "ps" está presente no Map
        Product ps = new Product("Notebook", 1200.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

        // Percorre as chaves do Map
        for (Product key : stock.keySet()){ // retorna um Set com as chaves do Map
            System.out.println(key + ": " + stock.get(key)); // printa a chave e o valor dos elementos do Map
            System.out.println(); // pula linha
        }

    }
}
