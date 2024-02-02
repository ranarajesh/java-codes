package solidprinciple.di;

public class ShoppingMall {

    private  DebitCard debitCard; // Tight coupling the debit card payment if want to change pay using credit card than it need to changes here and hardcode the dependency, which is violiting the DI principles
        // To solve this create abstration or interface so that both high level and low level module depends on abstraction for dependency control

    public ShoppingMall(DebitCard debitCard){
        this.debitCard = debitCard;
    }
    public void payThePayment(Object order, int amount){
        debitCard.doTransaction(amount);
    }
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShoppingMall shop = new ShoppingMall(debitCard);
        shop.payThePayment(new Object(), 1002);

    }
}
