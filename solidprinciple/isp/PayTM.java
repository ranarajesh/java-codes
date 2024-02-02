package solidprinciple.isp;

public class PayTM implements  IUPIPayments{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() { // here the Paytm is forced to implement this method which is part of feature of the paytm upi payment


    }
}
