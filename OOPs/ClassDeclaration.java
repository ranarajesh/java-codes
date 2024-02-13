package OOPs;

public class ClassDeclaration {
    
    static int var1; // class variable / field no need to initialized, it will return its default value.
    public static void main(String[] args) {
        int var2; // Local variable should be initialised 
        System.out.println(var1);
        System.out.println(var2);  // It will not handle in runtime error because it give compilation error. 
    }
}
