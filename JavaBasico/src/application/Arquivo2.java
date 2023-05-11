package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo2 {
    public static void main(String[] args){
        String path = "C:\\Users\\922017\\Desktop\\in.txt"; //caminho do arquivo
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); //recebe o 'FileReader' como argumento. Deixa mais rapido a leitura
            String line = br.readLine(); //lê uma linha do arquivo e se o arquivo estiver no final o 'readLine' retorna nulo
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
