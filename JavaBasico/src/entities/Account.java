package entities;

public class Account {
    private int numeroConta;
    private String nome;
    private double deposito;

    public Account(int numeroConta, String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public Account(int numeroConta, String nome, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nome = nome;
        adicionarDeposito(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDeposito() {
        return deposito;
    }

    public void adicionarDeposito(double quantia){
        deposito += quantia;
    }

    public void retirarDinheiro(double quantia){
        deposito -= quantia + 5.00;
    }

    public String toString(){
        return "Account "
                + numeroConta
                + ", Holder: "
                + nome
                + ", Balance: $ "
                + String.format("%.2f", deposito);
    }
}
