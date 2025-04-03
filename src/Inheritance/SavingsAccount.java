package Inheritance;

public class SavingsAccount extends BankAccount{
    int transfers;

    public int getTransfers() {
        return transfers;
    }

    public void setTransfers(int transfers) {
        this.transfers = transfers;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "transfers=" + transfers +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
