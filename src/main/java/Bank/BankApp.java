package Bank;

import Bank.Entity.Account;
import Bank.Entity.Date;

public class BankApp {
    public static void main(String[] args) {
        Account account1 = new Account();

        account1.deposit(1000,new Date("10/01/2021"));
        account1.deposit(2000,new Date("13/01/2021"));
        account1.retreat(500,new Date("14/01/2021"));
        account1.accountStatus();
    }

}
