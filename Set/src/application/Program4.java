package application;

import entities.Produto;

import java.util.Set;
import java.util.TreeSet;

public class Program4 {
    public static void main(String[] args){
        Set<Produto> set = new TreeSet<>();

        set.add(new Produto("TV", 900.0));
        set.add(new Produto("Notebook", 1200.0));
        set.add(new Produto("Tablet", 400.0));

        for (Produto p : set) {
            System.out.println(p);
        }
    }
}
