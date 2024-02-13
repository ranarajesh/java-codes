package OOPs.constructors;

public class ClassConstructor{
    // The Constructor is used to construct the object of class. It is special method that outlines the steps that are performed when an instance of class is created in the program. 
    // A constructor's name must be exactly the same as the name of its class
    // The constructor is special method because it does not have a return type. It is a good practice to declare/define it as the first member method. 

    // Default constructor is basic constructor of class which initilisse the default values of data members of class 
    // If don't create constructor than JVM will insert a default constructor for us. Thus once the class is compiled it will always at least have a non-argument constructor. 

    private int day;
    private int month;
    private int year;
    private boolean test;
    private double db;

    // Default constructor 
    public ClassConstructor(){
         // We must define the default values for day, month, and year
        day = 0;
        month = 0;
        year = 0;
    }

    // Parameterized constructor, we pass arguments to the constructor and set them as the values or our data members 
    public ClassConstructor(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // A bit more about constructors 
    // 'this' reference variable exists for every class. It refers to the class object iteself.

    // Calling  a constructor from a constructor
    // The this keyword followed by parentheses means that another constructor in the same Java class is being called. 
    public ClassConstructor(int day, int month, int year, boolean test, double db){
        this(day, month, year);
        this.test = test;
        this.db = db;
    }


    public void printDate(){ 
        System.out.println("Date: " + day + "/" + month + "/" + year+"/"+test+"/"+db);
      }
    public static void main(String[] args) {
        ClassConstructor cons = new ClassConstructor();
        cons.printDate();
        ClassConstructor consParameter = new ClassConstructor(25,8,1986);
        consParameter.printDate();
        // Calling constructor from a constructor example
        ClassConstructor callConstruct = new ClassConstructor(25,8,1986, true, 230938903.0930);
        callConstruct.printDate();

    }
}
