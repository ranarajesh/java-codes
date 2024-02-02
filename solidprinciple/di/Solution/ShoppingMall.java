package solidprinciple.di.Solution;

import solidprinciple.di.Solution.*;
public class ShoppingMall {
    private  IBankCard card;
    public ShoppingMall(IBankCard card){
        this.card = card;
    }
    public void payThePayment(Object order, int amount){
        card.doTransaction(amount);
    }

    public static void main(String[] args) {
        IBankCard card = new CreditCard();
        ShoppingMall shop = new ShoppingMall(card);
        shop.payThePayment("Mobile Phone", 309202);

    }
}
