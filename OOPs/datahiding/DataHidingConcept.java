package OOPs.datahiding;

public class DataHidingConcept {
    // Data hiding refers to the concept of hiding the inner working class and simply providing an interface through which the outside world can interact with the class without knowing what's going on inside.

    // The purpose is to implement classes in such a way that the instances (objects) of these classes should not be able to cause any unauthorized access or change in the original contents of a class. One class does not need to know anything about the underlying algorithms of another class. However, the two can still communicate.

    // Data Hiding can be dividing into two primary components:
    // 1: Encapsulation
    // 2: Abstraction

    // Encapsulation: in OOP refers to binding the data and the methods to manipulate that data together in a single unit (class).  Depending upon this unit, objects are created. Encapsulation is normally done to hide the state and representation of an object from outside. A class can be thought of as a capsule having methods and data members inside it.
    //As a rule of thumb, a good convention is to declare all the data members or instance variables of a class private. 

    // Advantages of Encapsulation#
    // Classes are easier to change and maintain.
    // We can specify which data member we want to keep hidden or accessible.
    // We decide which variables have read/write privileges (increases flexibility).

     private String userName;
     private String password;

     public DataHidingConcept(String userName, String password){
        this.password = password;
        this.userName = userName;
     }

     public String getUserName(){
        return this.userName;
     }
     public String getPassword(){
        return this.password;
     }

     public void login(String userName, String password){
        if(getUserName().toLowerCase().equals(userName.toLowerCase()) && getPassword().toLowerCase().equals(password.toLowerCase())){
            System.out.println("Access Granted!!");
        }else{
            System.out.println("Invalid Credentials!!!");
        }
     }
     public static void main(String[] args) {
        DataHidingConcept login = new DataHidingConcept("Test", "test@123");
        login.login("Test", "test@123");
        login.login("Test", "Test@123223");
     }
}
