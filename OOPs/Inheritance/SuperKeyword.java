package OOPs.Inheritance;

public class SuperKeyword {
    //this keyword in Java is used to refer to the instance of the current class.

    // In a similar fashion, the super keyword in Java is used to refer to the SuperClass members from inside the immediate Subclass. The use of super comes into play when we implement inheritance.
    // The super keyword is used in three major contexts:
    // 1: Accessing parent class fields#
    // 2: Calling a parent class method
    // 3: Using with constructors#

   // Important Note: When you create an Object of a SubClass type at the same time, an Object of SuperClass type is created by calling implicitly the constructor of SuperClass.
   // The call to the SuperClass constructor using super() is usually the first line of code inside the constructor of the SubClass. If we do not call super() in the SubClass constructor, the default no-argument constructor of SuperClass is called automatically. The super(parameters) call has to be used if we want to call a parameterized constructor of the SuperClass.
  //  Note: In a constructor we can include a call to super() or this() but not both. Also, these calls can only be used inside the constructors.

}
