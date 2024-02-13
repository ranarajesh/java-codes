package OOPs.polymorphism;

public class Polymorphism {
    // In programming, polymorphism refers to the same object exhibiting different forms and behaviors. 
    // For example, take the Shape class, the exact shape you choose can be anything. It can be Rectangle, circle, a polygon or a diamond. So, these are all shapes but their properties are different. 
    // Each of the above classes has their own implementation of calculateArea() in their respective class which inherited from Parent class 

    public double getArea(){

    }
}

class Rectangle extends Polymorphism{
    private double width;
    private double heigth;

    // constructor 
    public Rectangle(double width, double heigth){
        this.heigth = heigth;
        this.width = heigth;

    }

    public double getArea(){
        return width * heigth;
    }
}

class Circle extends Polymorphism{
    private double redius;

    // constructor 
    public Circle(double redius){
        this.redius  = redius;

    }

    public double getArea(){
        return 3.14 * redius * redius;
    }
}

class Driver{
    public static void main(String[] args) {
        Polymorphism[] shape = new Polymorphism[2];
        shape[0] = new Rectangle(2, 2);
        shape[1] = new Circle(2);
        System.out.println("Rectangle Area: "+shape[0].getArea());
        System.out.println("Circle Area: "+shape[1].getArea());


    }
}