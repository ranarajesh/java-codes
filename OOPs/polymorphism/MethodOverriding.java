package OOPs.polymorphism;

import java.lang.reflect.Method;

public class MethodOverriding {
    // Method overriding is the process of redefining  a parent class's method in a subclass.
    // If subclass provide specific implementation of a method that has been declared by one of its parent classes, it is known as method overriding.
    //  Advantages of the method overriding
    // Method overriding is very useful in OOP. Some of its advantages are stated below:

    // The derived classes can give their own specific implementations to inherited methods without modifying the parent class methods.

    // For any method, a child class can use the implementation in the parent class or make its own implementation.

    // Here are some key features of method overriding:

    // Method overriding needs inheritance and there should be at least one derived class.

    // Derived class(es) must have the same declaration, i.e., access modifier, name, same parameters and same return type as the method as of the base class.

    // The method in the derived class(es) must have different implementations from each other.

    // The method in the base class must be overridden in the derived class.

    // Base class/method must not be declared as a final class.
    // Method Overloading	                                                        Method Overriding
    // Overloading happens at compile time.	                                        Overriding happens at runtime
    // Gives better performance because the binding is being done at compile time.	Gives less performance 
                                                                                    // because the binding is being done at run time.
    // Private and final methods can be overloaded.	                                Private and final methods can not be overridden.
    // Return type of method does not matter in case of method overloading.	Return type of method must be the same in the case of overriding.
    // Arguments must be different in the case of overloading.	Arguments must be the same in the case of overriding.
    // It is being done in the same class.	Base and derived classes are required here.
    // Mostly used to increase the readability of the code.	Mostly used to provide the implementation of the method that is already provided by its base class.

    
}
