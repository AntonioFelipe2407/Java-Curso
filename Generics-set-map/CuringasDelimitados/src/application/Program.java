package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4); // lista do tipo int
        List<Double> myDoubles = Arrays.asList(3.14, 6.28); // lista do tipo double
        List<Object> myObjs = new ArrayList<Object>(); // lista mais generica do tipo obj

        copy(myInts, myObjs); // copia os elementos da lista myInts para a lista myObjs
        System.out.println(myObjs); // printa a lista myObjs
        copy(myDoubles, myObjs); // copia os elementos da lista myDoubles para a lista myObjs
        System.out.println(myObjs); // printa a lista myObjs

    }

    /*
    metodo reponsável por copiar os elementos das listas para uma outra lista mais generica
    *
    (List<? extends Number> source) = Diz que é uma lista Number ou um subtipo de Number
    (List<? super Number> destiny) = Diz que é uma lista Number ou um SUPER tipo de Number
     */
    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for (Number number: source){ // para cada number da lista source
            destiny.add(number); // destiny recebe number
        }
    }

}