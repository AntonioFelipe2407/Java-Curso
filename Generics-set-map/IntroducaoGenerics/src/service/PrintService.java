package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> { // classe generica

    private List<T> list = new ArrayList<>(); // lista generica



    public void add(T value) { // adiciona o valor para a lista
        list.add(value);
    }

    public void print(){ // printa os valores digitados
        System.out.print("[");
        if(!list.isEmpty()){ // programação defensiva verifica se a lista nao esta vazia
            System.out.print(list.get(0));
        }
        for(int i = 1; i<list.size(); i++){
            System.out.print(", " + list.get(i)); // printa o valor da lista na posicao i
        }
        System.out.println("] ");
    }

    public T first(){ // imprime o primeiro numero
        if (list.isEmpty()){ // programação defensiva verifica se a lista vazia
            throw new IllegalStateException("List is empty");
        } else {
            return list.get(0); // retorna o primeiro indice
        }
    }
}
