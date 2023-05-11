package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        String path = "C:\\Users\\922017\\Desktop\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            //lê uma linha do arquivo
            String name = br.readLine();
            while (name != null) {
                //adiciona o valor na lista
                list.add(name);
                //lê a proxima linha
                name = br.readLine();
            }
            //Forma de ordenar uma coleção.
            Collections.sort(list);//Lista ordenada
            for (String s : list) {
                System.out.println(s);//imprime cada um dos elementos
            }

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
    }
}
