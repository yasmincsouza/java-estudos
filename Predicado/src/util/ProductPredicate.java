package util;

import entities.Product;

import java.util.function.Predicate;

//interface funcional, pois só tem um metodo abstrato para ser implementado
public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
