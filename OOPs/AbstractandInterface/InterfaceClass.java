package OOPs.AbstractandInterface;

public class InterfaceClass {
    // Interface: An interface is just like a class and specifies the behavior that a class must implement. 
    // An interface can be used to achieve 100% abstraction as it contains the method signature/abstract method(what to be done) and no implementation details(how to be done) of these methods. In this way, interfaces satisfy the definition of abstraction. The implementation techniques of the methods declared in an interface are totally up to the classes implementing that interface.

    // An interface can be thought of as a contract that a class has to fulfill while implementing an interface. According to this contract, the class that implements an interface has to @Override all the abstract methods declared in that very interface.
    
    /* An interface can have:
    abstract method(s)
    default method(s)
    static method(s)
    private method(s)
    private static method(s)
    public static final variable(s)
    All the methods declared or implemented in an interface are by default public and all the variables are by default public static final.

    Just like an abstract class, an interface cannot be instantiated.

    To use an interface, a class must implement all of the abstract method(s) declared in it.

    An interface cannot have constructor(s) in it.

    A class cannot extend from more than one class, but it can implement any number of interfaces.

    An interface can extend from another interface.

    An interface cannot be declared private or protected.

    Note: A class uses the keyword implements to use an interface but an interface uses the keyword extends to use another interface.
    */

        /* Advantages of interfaces
    Interfaces allow us to achieve 100% abstraction.

    Interfaces can be used to achieve loose coupling in an application. This means that a change in one class doesn’t affect the implementation of the other class.

    By the use of interfaces, one can break up complex designs and clear the dependencies between objects.

    Interfaces can be used to achieve multiple inheritance 
    */

    //     Interfaces	Abstract Classes
    // Support multiple inheritance	Don’t support multiple inheritance
    // All members are public	Can have private, protected and public members
    // All data members are static and final	Can have non-static and non-final members too
    // Can’t have constructors	Constructors can be defined

    public void eat(){
        System.out.println(getClass().getSimpleName() + " is eating");
    }

    
    
}

interface CanFly{
    void flying();
    int test = 100;
}

class Parrot extends InterfaceClass implements CanFly{

    @Override
    public void flying() {
        System.out.println("Parrot is Flying");
        System.out.println(test);
        // test = 10; // The final field CanFly.test cannot be assigned
    }
    
}

class Penguin extends InterfaceClass{
    public void walk(){
        System.out.println("Penguin is Walking!!");
    }
}

class Driver {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Penguin penguin = new Penguin();
        parrot.eat();
        parrot.flying();

        penguin.eat();
        penguin.walk();
    }
}