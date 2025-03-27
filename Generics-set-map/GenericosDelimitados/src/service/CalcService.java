package service;

import java.util.List;

public class CalcService {

    // metodo responsável por achar o maior valor
    public static <T extends Comparable<? super T>> T max(List<T> list){ // Especifica que o metodo vai trabalhar com qualquer tipo T desde que o T seja qualquer subtipo de Comparable<T>
        if(list.isEmpty()){ // programaçao defensiva
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0); // Recebe o primeiro elemento da lista
        for(T item : list){ // para cada item da lista executa o bloco
            if(item.compareTo(max) > 0) { // Compara se cada item é maior que a variável max e se é maior do que zero
                max = item; // max recebe o proximo elemento
            }
        }
        return max; // retorna o maior valor
    }
}
