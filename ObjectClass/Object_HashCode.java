package ObjectClass;

public class Object_HashCode {
    
    /* 
    In Java, the hashCode() method is used to generate a hash code value for an object. Hash codes are integers that represent the internal state of an object and are commonly used in hash-based data structures such as HashMap and HashSet. 
    syntax: public int hashCode()
    Usage:
    - Hash-Based Collections: The primary use of hashCode() is in hash-based collections (HashMap, HashSet, etc.) to determine the bucket location where an object should be stored or looked up. By providing a proper hashCode() implementation, you improve the performance of these collections by distributing objects evenly across buckets.
    - Object Identity: In some cases, hashCode() can be used to identify objects within a collection or as a key in a mapping. However, it's important to note that hash codes are not unique identifiers, and you should rely on equals() for object equality comparisons.
    - Consistency with equals(): The hashCode() method should be implemented consistently with the equals() method. That is, if two objects are equal according to the equals() method, they must return the same hash code value according to the hashCode() method.
    */
    private String name;
    private int id;
    
    public Object_HashCode(String name, int id){
        this.name =name;
        this.id = id;
    }

    @Override
    public int hashCode(){
        int prime = 31;
        int result = 1;
        result = prime * result + this.id;
        result = prime * result + ((this.name == null) ? 0: name.hashCode());
        return result;
    }
    public static void main(String[] args) {
        Object_HashCode emp1 = new Object_HashCode("John", 1);
        Object_HashCode emp2 = new Object_HashCode("John", 1);
        System.out.println("Hash code of emp1 "+emp1.hashCode());
        System.out.println("Hash code of emp2 "+emp2.hashCode()); // here the hash code is different ideally it should be identically because it content are equally. Override the hashcode method to custom handle it .
    }

}