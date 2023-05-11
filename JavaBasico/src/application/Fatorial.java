package application;

import java.util.Scanner;

class Fatorial {
    public static int FirstFactorial(int num) {
        int x = 1;
        for( int i = 1; i <= num; i++ ) {
            x *= i;
        }
        return x;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(Integer.parseInt(s.nextLine())));
    }
}