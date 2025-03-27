package application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WritingFile {
    public static void main(String[] args) {

        String[] fields = {"Computer,890.50", "Iphone X,910.00", "Tablet,550.00"}; // conteúdo que o arquivo irá receber

        String sourceFileStr = "meuArquivo.txt"; // caminho do arquivo

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(sourceFileStr))){ // abrindo o arquivo para escrita
            for (String field : fields) {
                bw.write(field); // abre o arquivo e guarda as linhas
                bw.newLine(); // quebra de linha
            }
        } catch (Exception e) { // exception
            throw new RuntimeException(e);
        }
    }
}
