package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Trimestre {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student estudante = new Student();

        estudante.nome = sc.nextLine();
        estudante.primeiroTrimestre = sc.nextDouble();
        estudante.segundoTrimestre = sc.nextDouble();
        estudante.terceiroTrimestre = sc.nextDouble();

        System.out.println();
        System.out.printf("FINAL GRADE = %.2f%n", estudante.finalGrade());

        if (estudante.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", estudante.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
    }
}
