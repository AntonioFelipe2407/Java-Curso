package service;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    /**
     * Calcula a soma dos preços de produtos que atendem a uma condição específica.
     *
     * @param list Lista de produtos a ser analisada.
     * @param pred Condição (Predicate) que define quais produtos devem ser incluídos na soma.
     * @return A soma dos preços dos produtos que atendem ao Predicate.
     *
     * Vantagem: Este metodo promove o desacoplamento, pois a lógica da condição
     * pode ser alterada facilmente ao modificar o Predicate fornecido ao chamar
     * o metodo no programa principal. Isso torna o código mais flexível e reutilizável.
     */

    public double filteredSum(List<Product> list, Predicate<Product> pred){
        double sum = 0.0;
        for(Product p : list){
            if(pred.test(p)){ // Verifica se o produto atende à condição passada no Predicate
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
