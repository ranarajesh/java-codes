package OOPs;

public class AccessModifiers {
    private int gun; // A private member cannot be accessed directly from outside the class. The aim is to keep it hidden from the users and other classes. It is a popular practice to keep the data members private since we do not want anyone manipulating our data directly
   
    public int getGun(){  
    // Public tag indicates that the members can be directly accessed by anything which is in the same scope as the class object.

    // Member functions are usually public as they provide the interface through which the application can communicate with our private members.

        return gun;
    }

    // The protected category is unique. The access level to the protected members lies somewhere between private and public. The primary use of the protected tag can be found when using inheritance, which is the process of creating classes out of other classes.

    // The protected data members can be accessed inside a Java package. However, outside the package, they can only be referred to through an inherited class.
    protected void fire(){
        System.out.println("Shoot");
    }

    // When no access modifier is specified, it is considered default or package-private.
    // Classes, methods, and variables with default access are accessible only within the same package.
    // They cannot be accessed from outside the package, even by subclasses.
    // It provides encapsulation within the package, restricting access to its members from other packages.
    
    void fileCase(){
        System.out.println("Register complain only in their judicial area.");
    }
}

/**
 *  
 */
class Main {
    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
        System.out.println("accessModifiers.getGun() "+accessModifiers.getGun());
        accessModifiers.fire();
    }
    
}
