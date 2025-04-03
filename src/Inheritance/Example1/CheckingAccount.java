package Inheritance.Example1;

// Subclass (Child class) inherits from 'BankAccount'
public class CheckingAccount extends BankAccount{
     double limit;

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "limit=" + limit +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
