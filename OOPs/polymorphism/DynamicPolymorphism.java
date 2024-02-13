package OOPs.polymorphism;

import java.lang.reflect.Method;

import com.apple.laf.AquaButtonBorder.Dynamic;

public class DynamicPolymorphism {
    // Dynamic polymorphism is the mechanism by which methods can be defined with the same name, return type, and parameters in the base class and derived classes.
    // A reference variable of the base class can be referred to the derived classes objects:
    //   Static Polymorphism	Dynamic Polymorphism
    // Polymorphism that is resolved during compile time is known as static polymorphism.	Polymorphism that is resolved during run time is known as dynamic polymorphism.
    // Method overloading is used in static polymorphism.	Method overriding is used in dynamic polymorphism.


    public double getArea() {
        return 0;
      }

}

class Rectangle1 extends DynamicPolymorphism {  // extended form the DynamicPolymorphism class

    private double length;
    private double width;
    
    public Rectangle1(double length, double width) {
      this.length = length;
      this.width = width;
    }
  
    public double getArea() {
      return this.width * this.length;
    }
    
  }
  
  // A Circle is a DynamicPolymorphism
class Circle1 extends DynamicPolymorphism {
  
    private double radius;
    
    public Circle1(double radius) {
      this.radius = radius;
    }
  
    public double getArea() {
      return 3.13 * this.radius * this.radius;
    }
  
  
    public static void main(String args[]) {
      DynamicPolymorphism[] dynamicPolymorphism = new DynamicPolymorphism[2]; // Creating the DynamicPolymorphism array of size 2
  
      dynamicPolymorphism[0] = new Circle1(3); // creating the circle object at index 0
      dynamicPolymorphism[1] = new Rectangle1(2, 3); // creating the rectangle object at index 1
  
      System.out.println("Area of Circle: " + dynamicPolymorphism[0].getArea());
      System.out.println("Area of Rectangle: " + dynamicPolymorphism[1].getArea());
      DynamicPolymorphism s1 = new Circle1(3);
      DynamicPolymorphism s2 = new Rectangle1(2,3);
       System.out.println("Area of Circle: " + s1.getArea());
      System.out.println("Area of Rectangle: " + s2.getArea());
    }
  
  }
