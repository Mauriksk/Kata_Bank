package Bank.Actions;

import Bank.Entity.Amount;
import Bank.Entity.Date;

public class Retreat extends Transaction {

    public Retreat(Amount monto, Date fecha) {
        super(monto, fecha);
    }

    public void seeInformation(Integer balance){
        String _date = super.getDate().getFechaString();
        String _amount = super.getAmount().toString();
        System.out.format("%1s %12s %12s %15s %n", new String[]{_date,"",_amount,balance.toString()});
    }
}
