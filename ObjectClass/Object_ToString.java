package ObjectClass;

public class Object_ToString {
    // In Java, the toString() method is a method defined in the Object class, which serves to return a string representation of an object. Here's how it works and its common usage:

    /* 
    Syntax: public String toString()
    The toString() method returns a string representation of the object.
    By default, the toString() method provided by the Object class returns a string consisting of the class name followed by the "@" symbol and the object's hash code in hexadecimal format. For example, ClassName@hashCode. 
    
    Usage:
    - Debugging and Logging: The toString() method is commonly used for debugging and logging purposes to provide a human-readable representation of an object's state. This allows developers to quickly inspect the contents of an object during development and troubleshooting.
    - Custom String Representation: You can override the toString() method in your own classes to provide a custom string representation based on the object's internal state. This is useful for producing meaningful output when converting objects to strings, especially in user interfaces or data serialization.
    - Ease of Use: Many Java standard library classes, such as String, ArrayList, and HashMap, override the toString() method to provide meaningful representations of their contents. This makes it convenient to obtain string representations of these objects without having to implement custom logic.
    */

    private String name;
    private int id;
    
    public Object_ToString(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString(){
        return "Name: "+this.name + " id : "+this.id;
    }
    public static void main(String[] args) {
        Object_ToString emp = new Object_ToString("John", 1);

        System.out.println(emp.toString()); // without override the toString method the output would be Object_ToString@251a69d7 

        String employeeString = "Employee details: " + emp;
        System.out.println(employeeString);
    }
}
