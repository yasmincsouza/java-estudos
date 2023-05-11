package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //quantidade de dados que sera digitado
        int n = sc.nextInt();
        double[] vect = new double[n];

        //aloca os dados digitados no vetor
        for (int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        //soma os dados do vetor
        for (int i = 0; i < n; i++){
            soma += vect[i];
        }

        double media = soma / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", media);

        sc.close();
    }
}
