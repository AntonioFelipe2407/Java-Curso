package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Instancia o scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que informe o caminho completo do arquivo
        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        // Abre o arquivo para leitura dentro de um bloco try-with-resources (garante fechamento automático)
        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            // Usa LinkedHashMap para preservar a ordem de inserção das chaves
            Map<String, Integer> votes = new LinkedHashMap<>();

            // Lê a primeira linha do arquivo
            String line = br.readLine();

            // Processa cada linha do arquivo até encontrar um valor nulo (fim do arquivo)
            while (line != null){
                // Divide a linha pelo delimitador "," para obter os campos
                String[] fields = line.split(",");

                // O primeiro campo representa o nome do candidato
                String name = fields[0];

                // O segundo campo representa o número de votos, convertido para inteiro
                int count = Integer.parseInt(fields[1]);

                // Verifica se o nome já existe no mapa
                if (votes.containsKey(name)){
                    // Obtém a quantidade de votos acumulada até o momento
                    int votesSoFar = votes.get(name);

                    // Atualiza o valor somando os votos novos aos já existentes
                    votes.put(name,count + votesSoFar);
                } else {
                    // Caso seja a primeira ocorrência desse candidato, apenas insere no mapa
                    votes.put(name,count);
                }

                // Lê a próxima linha do arquivo
                line = br.readLine();
            }

            // Percorre o mapa e imprime os resultados (nome do candidato e total de votos)
            for (String key: votes.keySet()){
                System.out.println(key + ": " + votes.get(key));
            }
        // Exception
        } catch (Exception e) {
            // Em caso de erro, lança uma exceção para evitar falhas silenciosas
            throw new RuntimeException("Erro ao processar o arquivo: " + e.getMessage(), e);
        }

    sc.close();
    }
}
