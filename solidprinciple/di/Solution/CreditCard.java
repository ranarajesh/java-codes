package solidprinciple.di.Solution;

public class CreditCard  implements  IBankCard{
    public void doTransaction(int amount){
        System.out.println("Swap with CreditCard with ammount "+amount);
    }
}
