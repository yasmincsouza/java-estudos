package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
• Tamanho da lista: size()
• Obter o elemento de uma posição: get(position)
• Inserir elemento na lista: add(obj), add(int, obj)
• Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
• Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
• Filtrar lista com base em predicado:
List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
• Encontrar primeira ocorrência com base em predicado:
Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
 */

public class Lista {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//instanciando uma lista
        list.add("Maria"); //adicionar na lista
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); //adicionar um elemento na posição

        System.out.println(list.size()); //tamanho da lista

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco")); //nome que nao existe. Só para testar
        System.out.println("---------------------");

        //primeiro converte para stream, faz a operação lamba desejada e depois converte para lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        //primeiro converte para stream, faz a operação lamba desejada e depois pega o primeiro elemento do stream ou retorna nulo
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
