package application;

import java.util.HashMap;
import java.util.Map;

public class Exemplo1 {
    public static void main(String[] args) {
        // Cria um Map que associa strings a inteiros
        Map<String, Integer> mapa = new HashMap<>();

        // Adiciona elementos ao Map
        mapa.put("um", 1);
        mapa.put("dois", 2);
        mapa.put("três", 3);

        // Recupera um valor usando a chave
        int valor = mapa.get("um");

        // Imprime todos os pares de chave-valor no Map
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            String chave = entrada.getKey();
            valor = entrada.getValue();
            System.out.println(chave + " = " + valor);
        }
    }
}

