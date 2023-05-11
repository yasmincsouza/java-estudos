package application;

public class funcoes_strings {
    public static void main(String[] args){
        String original = "abcde FGHIJ ABC abc DEFG ";
        String s = "potato apple lemon";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-"); //minusculo
        System.out.println("toUpperCase: -" + s02 + "-"); //maiusculo
        System.out.println("trim: -" + s03 + "-"); //remover espaços
        System.out.println("substring(2): -" + s04 + "-"); //recortar uma string
        System.out.println("substring(2, 9): -" + s05 + "-"); //recortar uma string da posição 2 até a 9
        System.out.println("replace('a', 'x'): -" + s06 + "-"); //substituir
        System.out.println("replace('abc', 'xy'): -" + s07 + "-"); //substituir
        System.out.println("Index of 'bc': " + i); // buscar a posição
        System.out.println("Last index of 'bc': " + j); // buscar a posição

        System.out.println("-----------------------------");

        String[] vect = s.split(" "); //recortar uma string com base em um separador

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
