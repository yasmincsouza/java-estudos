package application;

import entities.Account2;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Sobreposicao {
    public static void main(String[] args){
        Account2 acc1 = new Account2(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println("ACC1 = " + acc1.getBalance());

        System.out.println("-----------------------------");

        Account2 acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.00);
        //Aparece o metodo @Override
        System.out.println("ACC2 = " + acc2.getBalance());

        System.out.println("-----------------------------");

        Account2 acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200);
        System.out.println("ACC3 = " + acc3.getBalance());
    }
}
