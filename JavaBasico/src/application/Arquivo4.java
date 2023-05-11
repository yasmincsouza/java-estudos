package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo4 {
    public static void main(String[] args){
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        String path = "C:\\Users\\922017\\Desktop\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            //para cada 'String line' contido no vetor 'lines', faça:
            for (String line : lines) {
                bw.write(line);//escreve no arquivo
                bw.newLine();//faz a quebra de linha
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
