package Array.fundamentals;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int age){
        this.lastName = last;
        this.firstName = first;
        this.age  = age;
    }

    public void displayPerson(){
        System.out.print("  Last Name: "+ lastName);
        System.out.print("  , First Name: "+ firstName);
        System.out.println("  , Age: "+ age);
    }

    public String getLastName() {
        return lastName;
    }
}
