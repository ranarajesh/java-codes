package OOPs;

public class Fields {
    String nonStatic = "Class have each copy of nonstatic variable";
    static String staticVar = "Static field can accessed by class name rather creating object of class";
    final String finalVar = "Cannot change the value of final variable";
    public static void main(String[] args) {
        Fields javaFields = new Fields();
        System.out.println(javaFields.nonStatic);
        System.out.println(Fields.staticVar);
        System.out.println(javaFields.finalVar);
        // javaFields.finalVar = "Not changed"; // compilation error


    }

}
