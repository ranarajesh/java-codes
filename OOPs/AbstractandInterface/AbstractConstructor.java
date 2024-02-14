package OOPs.AbstractandInterface;

public class AbstractConstructor {
    /* In Java, defining a constructor in an abstract class serves several purposes:

    Initialization of Common Fields: Abstract classes may contain common fields or attributes that are shared among their subclasses. Defining a constructor allows you to initialize these common fields once rather than repeating the initialization code in each subclass constructor.
    Enforcement of Initialization Logic: Constructors in abstract classes can enforce certain initialization logic that all subclasses must adhere to. This ensures that subclasses are properly initialized before they can be used.
    Providing a Default Constructor: If no constructor is explicitly defined in an abstract class, Java provides a default constructor with no arguments. However, if you need to initialize fields or perform certain tasks during object creation, you can define a constructor explicitly to provide this functionality.
    Constructor Overloading: Abstract classes can have multiple constructors, allowing subclasses to choose which constructor to invoke based on their specific initialization needs. This supports constructor overloading, providing flexibility in object creation.
 */

}

abstract class Shape {
    protected String color;

    // Constructor with one parameter
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate area
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    // Constructor with two parameters
    public Circle(String color, double radius) {
        super(color); // Call to superclass constructor
        this.radius = radius;
    }

    // Implementation of abstract method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AbstractConstructorDriver {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}