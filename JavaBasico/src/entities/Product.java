package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    //Construtor padrão
    public Product(){

    }

    //Construtor. Vai executar no momento da instanciação e
    // vai obrigar a fornecer os atributos dos objetos.
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Sobrecarga
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    //Colocado depois dos construtores
    //GET = Pegar o valor de um atributo
    //SET = alterar o valor do atributo
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
              + ", $"
              + String.format("%.2f", price)
              + ", "
              + quantity
              + " units, Total: $ "
              + String.format("%.2f", totalValueInStock());
    }
}
