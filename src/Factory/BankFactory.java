package Factory;

import Model.Bank;

public class BankFactory {
    public static Bank createBank(double balance){
        return Bank.getInstance(balance);
    }
}
