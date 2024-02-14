package OOPs.AggregationandAssocation.Quiz;

/* Library Management System
For this coding challenge, you are asked to create Member, and OverdueFee classes for a library management system.

Member variables
The Member class will have the following attributes:

amountOverdue: A OverdueFee type variable, containing information regarding the overdue fee.
The OverdueFee class will have the following attribute:

amount: A double type variable, containing the total amount a member owes to the library.
discountPercentage: A double type variable, containing the percentage that is applied to the amountDue and deducted from the total amount.
For this use case, the Member class object will compose an OverdueFee class object.

Member functions
You will need to implement the following methods for Member class:

setAmountOverdue(): This function takes two values as input, amount and discountPercentage (both are of double type). It then makes the necessary changes in the amountOverdue object.

getAmountOverdue(): This returns a double value equal to the amount after deducting the discount percentage. For example, if amount is 20 and discountPercentage is 10, then it should return 18.

Hint: The formula for above function is:

amount - [(discountPercentage/100) * amount].

In case the discountPercentage is zero, no amount should be deducted and implement error handling if needed. */
class Member {
    protected String name;
    // Add the missing member variable
    private OverdueFee amountOverdue;

    public Member(String name){
        this.name = name;
    }
    public double getAmountOverDue() {
        // Add function logic
        
        if(amountOverdue.amount == 0) return 0;
        else{
         double disper = amountOverdue.getDiscountPercentage() / 100;
         double disofamt = disper * amountOverdue.getAmount();
            return amountOverdue.getAmount() - disofamt ;
        }
        
    }

    public void setAmountOverDue(double amount, double discountPercentage) {
        // Add function logic
        amountOverdue.amount = amount;
        amountOverdue.discountPercentage = discountPercentage;
    }
}

class OverdueFee {

    protected double discountPercentage;
    protected double amount;
    // public OverdueFee(double discountPercentage, double amount){
    //     this.discountPercentage = discountPercentage;
    //     this.amount = amount;
    // }
    public double getDiscountPercentage(){
        return discountPercentage;
    }
    public double getAmount(){
        return amount;
    }


}
