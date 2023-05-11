package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args){
        //Objeto do tipo file, passando entre aspas o caminho do arquivo
        File file = new File("C:\\Users\\922017\\Desktop\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);//instanciando o scanner, mas no lugar de 'System.in' coloca o 'file'
            while (sc.hasNextLine()) { //testar se ainda existe uma nova linha no arquivo
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally { //boa pratica, colocar o fechamento do arquivo no bloco 'finally'
            if (sc != null) {
                sc.close();
            }
        }
    }
}
