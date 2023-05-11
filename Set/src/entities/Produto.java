package entities;

public class Produto implements Comparable<Produto>{
    private String name;
    private Double price;

    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    // (... get / set / hashCode / equals)
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Produto other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }
}
