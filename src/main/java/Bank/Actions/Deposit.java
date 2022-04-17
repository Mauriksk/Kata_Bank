package Bank.Actions;

import Bank.Entity.Amount;
import Bank.Entity.Date;

public class Deposit extends Transaction {
    public Deposit(Amount monto, Date fecha) {
        super(monto, fecha);
    }

    public void seeInformation(Integer balance){
        String _fecha = super.getDate().getFechaString();
        String _monto = super.getAmount().toString();
        System.out.format("%1s %12s %12s %15s %n", new String[]{_fecha,_monto,"",balance.toString()});
    }
}

