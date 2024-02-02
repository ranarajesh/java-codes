package solidprinciple.di;

import solidprinciple.di.Solution.IBankCard;

public class DebitCard implements IBankCard {
    public void doTransaction(int amount){
        System.out.println("Swap with DebitCard");
    }
}
