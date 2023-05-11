package application;

import java.util.Locale;
import java.util.Scanner;

public class entrada_dados {
    public static void main(String[] args){
        String x;
        int y;
        double z;
        char w;

        //Para fazer entrada de dados, nós vamos criar um objeto do tipo "Scanner"
        Scanner sc = new Scanner(System.in);

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        w = sc.next().charAt(0);
    }
}
