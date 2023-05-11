package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args){
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "maria");//inserir
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99771122");

        cookies.remove("email");//remove
        cookies.put("phone", "99771133");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));//testa para vê se contém
        System.out.println("Phone number: " + cookies.get("phone"));//valor da chave
        System.out.println("Email: " + cookies.get("email"));//quando não existe retorna nulo
        System.out.println("Size: " + cookies.size());//tamanho do map

        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {//retorna um set com as chaves do map
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
