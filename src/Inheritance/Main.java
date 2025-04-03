package Inheritance;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        // Create the object of Checking account class and access the field of Bank Account class
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountNumber("1234");
        checkingAccount.setBalance(200);
        checkingAccount.setLimit(1000);
        System.out.println("Checking Account:"+ checkingAccount.toString());

        // Create the object of Savings account class and access the field of Bank Account class
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountNumber("2345");
        savingsAccount.setBalance(400);
        savingsAccount.setTransfers(20);
        System.out.println("\nSavings Account:"+ checkingAccount.toString());

        // Create the object of COD account class and access the field of Bank Account class
        COD cod = new COD();
        cod.setAccountNumber("4567");
        cod.setBalance(5000);
        cod.setExpiry(new Date(02,02,2030));
        System.out.println("\nCOD Account:"+ checkingAccount.toString());
    }
}
