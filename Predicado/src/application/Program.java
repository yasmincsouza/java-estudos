package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        //referencia para metodo estatico
        //list.removeIf(Product::staticProductPredicate);

        //referencia para metodo nao estatico
        //list.removeIf(Product::nonStaticProductPredicate);

        //Implementação da interface
        //list.removeIf(new ProductPredicate());

        //Expressão 'lambda' declarada
        //Predicate<Product> pred = p -> p.getPrice() >= min;
        //list.removeIf(pred);

        //Expressão 'lambda' inline
        list.removeIf(p -> p.getPrice() >= min);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
