package Service;
import Model.Bank;

import java.text.NumberFormat;

public class BankService {
    private Bank bank;

    public BankService(){
        this.bank = Bank.getInstance(0);
    }

    public BankService(Bank bank){
        this.bank = bank;
    }

    public String deposit(double amount){
        if(amount <= 0) return "Balance must be above $0";
        this.bank.setBalance(this.bank.getBalance() + amount);
        return "You deposit" + amount + "Now you have" + (this.bank.getBalance());
    }

    public String withdraw(double amount){
        if(amount > this.bank.getBalance()) return "Insufficient balance.";
        this.bank.setBalance(this.bank.getBalance() - amount);
        return "You withdraw" + amount + "Now you have" + (this.bank.getBalance());
    }

    public String getBalance(){
        return "You have: " + NumberFormat.getCurrencyInstance().format(this.bank.getBalance());
    }
}
