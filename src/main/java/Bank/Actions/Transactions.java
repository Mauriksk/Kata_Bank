package Bank.Actions;

import Bank.Entity.Amount;
import Bank.Entity.Date;

import java.util.ArrayList;
import java.util.List;

public class Transactions {
    private List<Transaction> transactions;

    public Transactions() {
        this.transactions = new ArrayList<>();
    }

    public void addDeposit(Integer monto, Date fecha){
        Deposit deposit = new Deposit(new Amount(monto),fecha);
        transactions.add(deposit);
    }

    public void addRetreat(Integer amount, Date date){
        Retreat retreat = new Retreat(new Amount(amount),date);
        transactions.add(retreat);
    }

    public void listTransaction(){
        Integer balance = 0;
        for(Transaction transaction : this.transactions){
            balance = uptadeBalance(transaction,balance);
            transaction.seeInformation(balance);
        }
    }

    private Integer uptadeBalance(Transaction transaction, Integer balance){
        if(transaction instanceof Deposit){
            return balance += transaction.getAmount();
        }
        //ES UN RETIRO
        return balance -= transaction.getAmount();
    }

}
