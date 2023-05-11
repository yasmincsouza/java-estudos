package application;

import java.io.File;
import java.util.Scanner;

public class Arquivo5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("-----------------------------------");
        //Lista somente quem for diretorio(pasta)
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        //para cada 'folder' na lista de 'folders', faça:
        for (File folder : folders) {
            System.out.println(folder);
        }
        System.out.println("-----------------------------------");
        //Lista somente quem for arquivo
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        //para cada 'file' na lista de 'files', faça:
        for (File file : files) {
            System.out.println(file);
        }

        System.out.println("-----------------------------------");
        //cria uma subpasta
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
