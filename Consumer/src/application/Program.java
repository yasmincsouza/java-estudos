package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args){
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;

        //Implementação da ‘interface’
        //list.forEach(new PriceUpdate());

        //referencia para metodo estatico
        //list.forEach(Product::staticPriceUpdate);

        //referencia para metodo nao estatico
        //list.forEach(Product::nonStaticPriceUpdate);

        //Expressão 'lambda' declarada
        //Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
        //list.forEach(cons);

        //Expressão 'lambda' inline
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(System.out::println); //imprime
    }
}
