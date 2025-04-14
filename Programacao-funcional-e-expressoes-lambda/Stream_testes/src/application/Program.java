package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,10,5,7);

        //Criando uma stream a partir de uma lista
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        // Criando uma stream utilizando o Stream.of()
        Stream<String> st2 = Stream.of("Maria", "Antonio", "Felipe");
        System.out.println(Arrays.toString(st2.toArray()));

        // Criando uma Stream utilizando o iterate()
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // iterando os elementos em dois
        System.out.println(Arrays.toString(st3.limit(5).toArray())); // imprimindo 5 elementos da stream

        //Criando uma sequência de fibonacci
        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(5).toArray()));

    }
}
