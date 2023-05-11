package entities;

//Sintaxe da herança:
public class BusinessAccount extends Account2 {
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    //'super()' executa a lógica do construtor da classe base/superclasse
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);//chamou o construtor da superclasse para não repetir as atribuições
        //dos três primeiros argumentos
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }
}
