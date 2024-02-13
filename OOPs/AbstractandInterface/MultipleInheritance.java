package OOPs.AbstractandInterface;

public class MultipleInheritance {
    // Multiple Inheritance can be implemented using interfaces  
    // A class can implement more than one interfaces and an interface can extend from more than one interfaces.  
}

interface IsSedan{
    int bootSpace = 420;
    void bootSpace();
}

class Car {
    private int model;
    private String manufacturer;
    public Car(int model, String manufacturer){
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void printDetails(){
        System.out.println("The Model of "+ getClass().getSimpleName() + " is :" + model);
        System.out.println("The Manufacturer of "+ getClass().getSimpleName() + " is :" + manufacturer);
        System.out.println(getClass().getModifiers());
    }
}

class Elantra extends Car implements IsSedan{

    private String varient;
    public Elantra(int model, String varient){
    super(model, "Hyundai");
    this.varient = varient;
    }

    @Override
    public void bootSpace(){
        System.out.println("The bootspace is "+ bootSpace + " litres");
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("The varient is "+varient);
    }

}

class MultipleInheritanceDriver{
    public static void main(String[] args) {
        Elantra sport = new Elantra(2019, "Sport");  //creating Sports variant Elantra
        Elantra eco = new Elantra(2018, "Eco");      //creating Eco variant Elantra

        sport.printDetails();    
        sport.printDetails();       

        eco.printDetails();
        eco.bootSpace();
    }
}