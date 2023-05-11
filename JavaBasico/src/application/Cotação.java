package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Cotação {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double precoDolar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantia = sc.nextDouble();

        double result = CurrencyConverter.dolarParaReal(quantia, precoDolar);
        System.out.printf("Amount to be paid in reais = %.2f", result);
        sc.close();
    }
}
