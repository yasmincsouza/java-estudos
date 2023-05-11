package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoEstrutura {
    public static void main(String[] args){
        method1();
        System.out.println("End of program");
    }
    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }
    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace(); //imprime na tela o rastreamento do stack *Imprimiu o tipo da exceção, a mensagem da exceção
            //e a sequência de chamadas que gerou a exceção. É bom para analisar o que vem acarretando a exceção.
            sc.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        sc.close();
        System.out.println("***METHOD2 END***");
    }
}
