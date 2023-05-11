package application;

import entities.Account;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class banco {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int numero = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine(); //consumir a quebra de linha que ficou pendente no nextInt
        String nome = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0); // le o caracter

        if (resposta == 'y'){
            System.out.print("Enter initial deposit value: ");
            double depositoInicial = sc.nextDouble();
            account = new Account(numero, nome, depositoInicial);
        }
        else {
            account = new Account(numero, nome);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double valorDeposito = sc.nextDouble();
        account.adicionarDeposito(valorDeposito);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double sacarDeposito = sc.nextDouble();
        account.retirarDinheiro(sacarDeposito);
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
