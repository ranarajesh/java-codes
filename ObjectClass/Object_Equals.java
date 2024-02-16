package ObjectClass;

public class Object_Equals {
    
    /* 

    The equals() method is used to compare the contents of two objects to determine if they are logically equality
    public boolean equals(Object obj)
    - It returns true if the objects are equal, false otherwise.
    - By default, the equals() method provided by the Object class compares object references (memory addresses) to check for equality. However, it's common practice to override this method in your own classes to provide custom equality comparisons based on object content.
    
    Usage:
    - Custom Equality Comparisons: Overriding the equals() method allows you to define custom rules for determining when two objects should be considered equal. This is particularly useful when comparing objects based on their internal state or content rather than their memory addresses.

    - Contract with hashCode(): When you override equals(), you should also override the hashCode() method to ensure that equal objects produce the same hash code. This is important for objects that are used in hash-based collections such as HashMap and HashSet.
    
    - Collections: The equals() method is commonly used when working with collections to determine if a collection contains a specific element. For example, when you call contains() on a List or Set, it internally uses the equals() method to check for equality.
    
    - String Comparison: In the case of String objects, the equals() method compares the content of the strings rather than their memory addresses. This allows you to check if two strings have the same characters in the same sequence.
    
    */

    private String name;
    private int id;
    
    public Object_Equals(String name, int id){
        this.name =name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Object_Equals emp = (Object_Equals) obj;
        return this.id == emp.id && this.name.equals(emp.name); 
        // return id == emp.id && name.equals(emp.name); 
    }
    public static void main(String[] args) {
        Object_Equals emp1 = new Object_Equals("John", 1);
        Object_Equals emp2 = new Object_Equals("John", 1);
        Object_Equals emp3 = new Object_Equals("Vikas", 3);

        System.out.println(emp1.equals(emp2)); // this comparing the reference of object rather content ; we need to override the Object equals method to handle custom comparision 
        //System.out.println(emp1.super.equals(emp2));
    
        System.out.println(emp1.equals(emp3));
        System.out.println("Hash code of emp1 "+emp1.hashCode());
        System.out.println("Hash code of emp2 "+emp2.hashCode());
        

        
    }
}
