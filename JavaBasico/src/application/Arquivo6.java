package application;

import java.io.File;
import java.util.Scanner;

public class Arquivo6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getPath: " + path.getPath());//Pega o caminho completo
        System.out.println("getParent: " + path.getParent());//Pega o caminho sem o nome do arquivo
        System.out.println("getName: " + path.getName());//Pega o nome do arquivo

        sc.close();
    }
}
