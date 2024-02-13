package OOPs.Inheritance.typeofinheritence;

public class SingleInheritance {
    // In single inheritence, there is only a single class extending from another class. 
    // Note: In Java, Multiple and Hybrid inheritance are applicable using interfaces only.



    private int topSpeed;
    public SingleInheritance(int speed){
        this.topSpeed = speed;
        System.out.println("The top speed is set to: "+ topSpeed);
    }
}

class Car extends SingleInheritance{

    public Car(){
        super(100);
    }
    public void carDetails(){
        //System.out.println(super.topSpeed);
    }
    public static void main(String[] args) {
        Car test = new Car();
    
    }
}
