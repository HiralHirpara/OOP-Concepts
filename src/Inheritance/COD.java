package Inheritance;

import java.util.Date;

public class COD extends  BankAccount{
    Date expiry;

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "COD{" +
                "expiry=" + expiry +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
