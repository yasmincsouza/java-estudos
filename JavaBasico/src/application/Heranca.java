package application;

import entities.Account2;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Heranca {
    public static void main(String[] args){
        Account2 acc = new Account2(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account2 acc1 = bacc;
        Account2 acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account2 acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);
        //operação não permitida, pois 'SavingsAccount' é uma 'Account', mas ela não é uma 'BusinessAccount':
        //BusinessAccount acc5 = (BusinessAccount)acc3;

        //se acc3 for um objeto que seja instancia de BusinessAccount, ai sim pode fazer o casting
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
