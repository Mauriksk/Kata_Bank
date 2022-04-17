package Bank.Actions;

import Bank.Entity.Amount;
import Bank.Entity.Date;

public class Transaction {
    private Amount amount;
    private Date date;

    public Transaction(Amount monto, Date fecha) {
        this.amount = monto;
        this.date = fecha;
    }

    public Integer getAmount(){
        return amount.getAmount();
    }

    public Date getDate() {
        return date;
    }

    public void seeInformation(Integer balance){

    }
}
