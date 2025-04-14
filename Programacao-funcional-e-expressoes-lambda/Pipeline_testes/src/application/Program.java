package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        //Cada elemento da Stream será múltiplicado por 10
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        // Realiza o somatório da lista
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        /*
         Cria uma stream a partir da lists, filtra os pares,
         múltiplica por 10 e transforma em uma Lista
         */
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));


    }
}
