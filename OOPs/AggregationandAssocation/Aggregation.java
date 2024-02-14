package OOPs.AggregationandAssocation;

public class Aggregation {
    /* Aggregation follows the has-A model. This creates a parent-child relationship between two classes, with onclass owning the object of another. 
    In Aggreation, the lieftime of the owned object does not depend on the lifetime of the owner. The parent only contains the reference to the child  
    */
    
   /*  For example: Relationship between People and Country. Each person is associated with country, but the country can exist without that person 
    -> Computer has-a monitor 
     */

}

class Country{
    private String name;
    private int population;

    public Country(String name, int population){
        this.name = name;
        this.population = population;
    }

    public String getName(){
        return name;
    }
}

class Person{
    private String name;
    private Country country;

    public Person(String name, Country country){
        this.name = name;
        this.country = country;
    }

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Country: " + country.getName());
    }
}

class AggregationDriver{
    public static void main(String[] args) {
        Country country = new Country("India", 700000);
        {
            Person person = new Person("Vikas", country);
            person.printDetails();
        }

        System.out.println(country.getName());
    }
}