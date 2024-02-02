package solidprinciple.di.Solution;

public class DebitCard implements IBankCard {
    public void doTransaction(int amount){
        System.out.println("Swap with DebitCard with ammount "+amount);
    }
}
