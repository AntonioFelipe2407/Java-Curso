package application;

import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando e abrindo o arquivo para escrita no formato CSV
        try (FileWriter fw = new FileWriter("Arquivo.csv")) {
            System.out.println("Digite o conteúdo do arquivo (digite 'Sair' para finalizar): ");

            // Loop contínuo para receber múltiplas linhas do usuário
            while (true) {
                String linha = sc.nextLine(); // Captura a entrada do usuário

                //Verifica se o usuário deseja encerrar a escrita no arquivo
                if (linha.equalsIgnoreCase("Sair")) {
                    break;
                }

                //Escreve a linha digitada no arquivo e adiciona uma qiebra de linha
                fw.write(linha + "\n");
            }
            System.out.println("Conteúdo salvo no arquivo!"); // confirma que ocorreu tudo certo

        } catch (Exception e) {
            //Captura e trata possíveis erros ao criar ou manipular o arquivo
            System.out.println("Erro ao acessar o arquivo!");
            e.printStackTrace();
        }

        sc.close();
    }
}
