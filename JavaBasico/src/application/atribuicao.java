package application;

public class atribuicao {
    public static void main(String[] args){
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        //Casting '(double) a / b;'= É a conversão explícita de um tipo para outro. É necessário quando o compilador não é capaz de “adivinhar” que o
        //resultado de uma expressão deve ser de outro tipo.
        resultado = (double) a / b;
        System.out.println(resultado);
    }
}
