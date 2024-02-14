package OOPs.AggregationandAssocation;

public class Composition {
/*     Composition is the practice of creating other class objects in your class and owner class is responsibel for the lifetye of that object.

    Composition relationships are Part-Of relationships where the part must constitute part of the whole object. We can achieve composition by adding smaller parts of other classes to make a complex unit.

    In composition, the lifetime of th eowned object depends on the lifetime of the owner. 
    */

    /* For Example: 
    -> A car is composed of an Engine, tires, and doors. 
    -> In Reciepe, ingredient is part of Reciepe
    -> Smartphone is compose of camera  
    */
}

class Engine{
    private int capacity;
    public Engine(){
        capacity = 0;
    }
    public Engine(int cap){
        capacity = cap;
    }
    public void engineDetails(){
        System.out.println("Engine Details : "+ capacity);
    }
}

class Tires{
    private int noOfTires;
    public Tires(){
        noOfTires = 0;
    }
    public Tires(int noOfTires){
        this.noOfTires = noOfTires;
    }
    public void tireDetails() {
        System.out.println("Number of tyres: " +  noOfTires);
      }
}

class Doors {
  
    private int noOfDoors;
    
    public Doors() {
      noOfDoors = 0;
    }
    
    public Doors(int nod) {
      noOfDoors = nod;
    }
    
    public void doorDetails() {
      System.out.println("Number of Doors: " + noOfDoors);
    }
    
  }
  

  class Car{
    private String color;
    private Engine engine;
    private Tires tires;
    private Doors doors;

    public Car(String color, int capacity, int noOfTires, int noOfDoors){
        this.color = color;
        this.engine = new Engine(capacity);
        this.tires = new Tires(noOfTires);
        this.doors = new Doors(noOfDoors);
    }

    public void carDetails(){
        engine.engineDetails();
        tires.tireDetails();
        doors.doorDetails();
        System.out.println("Car Color : "+color);
    }
  }

  class CompositionDriver{
    public static void main(String[] args) {
        Car myCar = new Car("Lava Blue", 1500, 4, 5);
        myCar.carDetails();
    }
  }