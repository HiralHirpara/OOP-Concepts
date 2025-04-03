package Inheritance.Example1;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        // Create the object of Checking account class and access the field of Bank Account class
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountNumber("1234");
        checkingAccount.setBalance(200);
        checkingAccount.setLimit(1000);

        // Output: CheckingAccount{limit=1000.0, accountNumber='1234', balance=200.0}
        System.out.println(checkingAccount.toString());

        // Create the object of Savings account class and access the field of Bank Account class
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountNumber("2345");
        savingsAccount.setBalance(400);
        savingsAccount.setTransfers(20);

        //Output: SavingsAccount{transfers=20, accountNumber='2345', balance=400.0}
        System.out.println("\n"+ savingsAccount.toString());

        // Create the object of COD account class and access the field of Bank Account class
        COD cod = new COD();
        cod.setAccountNumber("4567");
        cod.setBalance(5000);
        cod.setExpiry(new Date(02,02,2030));

        // Output: COD{expiry=Fri Sep 20 00:00:00 PST 1907, accountNumber='4567', balance=5000.0}
        System.out.println("\n"+ cod.toString());
    }
}
