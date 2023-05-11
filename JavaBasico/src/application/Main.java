import java.util.Locale;

public class Main {
    public static void main(String[] args){
        int y = 20;
        double x = 10.78946;
        String nome = "Yasmin";
        int idade = 20;
        double renda = 2000;
        String letra = "a";

        //Saída de dados. print(SEM QUEBRA DE LINHA); println(COM QUEBRA DE LINHA).
        System.out.println("Olá mundo!");
        System.out.println("Bom dia");
        System.out.println("--------------------------");

        System.out.println(y);
        System.out.println(x);

        //printf. abreviação de formatado. Imprimir algo formatado
        System.out.printf("%.2f%n", x); //%n para ter uma quebra de linha

        //padrão americano para pontos. Adicionar antes do comando de saída
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("--------------------------");

        //Para concatenar vários elementos em um mesmo comando de escrita
        //%f = ponto flutuante
        //%n = quebra de linha
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
