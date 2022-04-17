package Bank.Entity;

public class Amount {
    private Integer amount;

    public Amount(Integer monto) {
        this.amount = monto;
    }

    public boolean validAmount(Integer amount){
        if(amount > 0){
            return true;
        }
        return false;
    }

    public boolean validRetreat(Integer amount){
        if(amount > 0 || amount >= this.amount){
            return true;
        }
        return false;
    }

    public void sumarMonto(Integer amount){
        this.amount += amount;
    }

    public void restarMonto(Integer amount){
        this.amount -= amount;
    }

    public Integer getAmount(){
        return this.amount;
    }
}
