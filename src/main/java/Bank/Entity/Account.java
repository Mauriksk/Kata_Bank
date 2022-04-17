package Bank.Entity;

import Bank.Actions.Transactions;

public class Account {
    private Amount amount;
    private Transactions transactions;

    public Account() {
        this.amount = new Amount(0);
        this.transactions = new Transactions();
    }

    public void deposit(Integer monto, Date fecha){

        if(this.amount.validAmount(monto)){
            this.amount.sumarMonto(monto);
            this.transactions.addDeposit(monto,fecha);
        }

    }

    public void retreat(Integer amount, Date date){

        if(this.amount.validRetreat(amount)){
            this.amount.restarMonto(amount);
            this.transactions.addRetreat(amount,date);
        }
    }

    public void accountStatus(){
        System.out.format("%5s %15s %15s %15s %n", new String[]{"Date","Credit","Debit","Balance"});
        this.transactions.listTransaction();
    }

}
