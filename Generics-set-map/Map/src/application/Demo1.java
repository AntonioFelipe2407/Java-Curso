package application;

import java.util.Map;
import java.util.TreeMap;

public class Demo1 {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        //Adiciona elementos (chave, valor)
        cookies.put("username", "Maria");
        cookies.put("e-mail", "Maria@gmail.com");
        cookies.put("phone", "40028922");

        // Remove o elemento pela chave
        cookies.remove("e-mail");

        // Sobrescreve o valor da chave
        cookies.put("phone", "08007777");

        //Verifica se a chave existe no Map (retorna um boolean)
        System.out.println( "Contains 'phone' key: " +cookies.containsKey("phone"));

        //Retorna o valor associado à chave.
        System.out.println( "Phone number: " + cookies.get("phone"));
        System.out.println("E-mail: " + cookies.get("email")); // retorna null pois o elemento não existe

        //Retorna o número de elementos.
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES:");
        // Percorre as chaves do Map
        for (String key :cookies.keySet()){ // retorna um Set com as chaves do Map
            System.out.println(key + ": " + cookies.get(key)); // printa a chave e o valor
        }

    }
}
