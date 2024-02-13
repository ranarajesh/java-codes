package OOPs.AbstractandInterface;

public class AbstractionInOops {
    // Abstraction in oops refers to showing only the enssential features of an object to the user and hiding the inner details to reduce complexity. It can be put this way that the user only has to know " what an object does?"  rather "how it does?"
    // The above illustration of the users and the admin of an application is a good real-world example of abstraction.

    // A user can only use and interact with the limited features of an application and is unaware of the implementation details or the way the application was developed. Usually, the users are only concerned with the functionality of an application.
    // An admin can have the access to a lot more features of the application and nothing is hidden from him. The admin can monitor the activity of the users, knows how the application was developed and can implement new features by deploying them in the application.

    public static void main(String[] args) {
        int min = Math.min(15,18);
        double square = Math.pow(2, 2);
        System.out.println(min);
        System.out.println(square);
    }

    // Abstract Data Type / ADT (or class) is type that only defines "what operations are to be performed?" rather than "how to be performed?" 
    // For example: built-in stack class in Java which the user knows that it has the push(), pop(), size()
    // using Abstract classes and Interface we can achieve abstraction in Java 
    // it is impossible to achieve abstraction without using the abstract keyword. The abstract keyword can be used with the methods and classes only.
    // Whenever the keyword abstract is used with the classes or methods, those methods or classes then only specify “what operations should be done” and whoever will use this method or class in their code will have to deal with the implementation details of this method or class.

}
