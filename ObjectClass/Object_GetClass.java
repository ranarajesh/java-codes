package ObjectClass;

public class Object_GetClass {
    // getClass method of Object class is used to return the runtime class of this object 
    // Usage: 
    /* 
    ->  Obtaining runtime class information: runtime type checking and introspection 
    ->  Determine Object Type : you can determine the actual class of an object at runtime, which can be useful for implementing polymorphic behavior or handling different types of objects dynamically.
    ->  Reflection:  is often used in conjunction with reflection to dynamically inspect and manipulate objects and classes at runtime. For example, you can use it to retrieve information about fields, methods, and constructors of a class
    -> Equals Method: In some implementations of the equals() method, getClass() is used to compare the runtime types of objects to determine equality. 
    
    */
    public static void main(String[] args) {
        String str = "10";
        Integer num = 10;
        Class<?> strClass = str.getClass();
        Class<?> numClass = num.getClass();
        System.out.println("Class of str "+strClass);
        System.out.println("Class of num "+numClass);

    }
}

