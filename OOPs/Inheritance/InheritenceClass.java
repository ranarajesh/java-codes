package OOPs.Inheritance;

import OOPs.ClassDeclaration;

public class InheritenceClass {
    // Inheritance provides a way to create a new class from an existing class. The new class is a specialized version of the existing class such that it inherits all the non-private fields (variables) and methods of the existing class. 
    // IS A : wherever we come across an IS A relationship between objects, we can use inheritance.
    // Square is shape, Java is a Programming Language, Car is a Vehicle
    // Existing Class	        Derived Class
    // Shape	                Square
    // Programming Language	    Java
    // Vehicle	                Car

    // IS a relationship does not exist 
    // Square is a corners , Java is a Syntax , Car is a Steering

    // In Java whenever we create a class, it inherits all the non-private methods and fields from the builtin Java Object class by default which makes it a very good example of inheritance in Java. 

    // What does a child class have?
    // An object of the child class can use:
    // All non-private members defined in the child class.
    // All non-private members defined in the parent class.
    // Note: Some classes cannot be inherited. Such classes are defined with the keyword, final. An example of such a class is the built-in Integer class - this class cannot have derived classes.
    // In Java, we have to use the keyword extends to implement inheritance:
    // Note: In Java, a class can extend from only one other class at a time and a class cannot extend itself.
    // type of inheritence : single, multi-level , multiple, hierarchical, hybrid 
    // Note: In Java, Multiple and Hybrid inheritance are applicable using interfaces only.
    // Advantages of Inheritence: Re-usability, data hiding, extensibility, Avoiding Duplication of Code


    private String make; 
    private String color; 
    private int year;      
    private String model;   


    // Parameterized Constructor
    public InheritenceClass(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;  
        this.model = model; 
    }

    // public method to print details
    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }

    public final void finalFun(){
        System.out.println("Final Method defined in base class");
    }

}

// Derived class 
class Car extends InheritenceClass{
    // Implicit super constructor InheritenceClass() is undefined for default constructor. Must define an explicit constructorJava(134217868)
    private String bodyStyle;
    
    public Car(String make, String color, int year, String model, String bodyStyle){
        super(make, color, year, model);
        this.bodyStyle = bodyStyle;
    }

    public void carDetails(){
        printDetails();
        System.out.println("Body Style: " + bodyStyle);
    }

    // Cannot override the final method from InheritenceClassJava(67109265)
    /* public final void finalFun(){ 
        
    }
    */
    public static void main(String[] args) {
        Car car = new Car("Skoda", "Lava Blue", 2023, "Kushaq", "SUV");
        car.carDetails();
    }

}