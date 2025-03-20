package Model;

import java.text.NumberFormat;

public class Bank {
    private static Bank instance;
    private double balance;

    private Bank (double balance){
        this.balance = balance;
    }

    public static Bank getInstance(double balance) {
        if (instance == null) {
            instance = new Bank(balance);
        }
        return instance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
