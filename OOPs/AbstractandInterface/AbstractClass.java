package OOPs.AbstractandInterface;

abstract class AbstractClass {
    // Abstract method
    // Rules to be followed
    // In contrast to a concrete/normal Java method an abstract method does not have a body/definition i.e. it only has a declaration or method signature inside an abstract class or an interface.

    // An abstract method can be declared inside an abstract class or an interface only.

    // In other words, it can be said that to contain any abstract method in its implementation a class has to be declared as an abstract class because non-abstract classes cannot have abstract methods.

    // An abstract method cannot be declared private as it has to be implemented in some other class.
    // syntax:  public abstract void methodName(parameter(s))

    // Abstract class: An abstract class is a class which is declared using the keyword abstract.

    //    Rules to be followed
    // An abstract class cannot be instantiated i.e. one cannot create an object of an abstract class.

    // An abstract class can have the declaration of abstract method(s) (as an abstract method’s body cannot be implemented in an abstract class) but it is not compulsory to have any.

    // Non-abstract/normal methods can be implemented in an abstract class.

    // To use an abstract class it needs to be inherited from.

    // The class which inherits from the abstract class must implement all the abstract methods declared in the parent abstract class.

    // An abstract class can have everything else as same as a normal Java class has i.e. constructor, static variables and methods.
    
    public abstract void makeSound();
    public void move(){
        System.out.println(getClass().getSimpleName()+" is moving!!!");//getClass().getSimpleName() is an inbuilt functionality of Java to get the class name from which the method is being called
    }
    public final void testFinalMethod(){
        System.out.println("testFinalMethod");
    }
    

}

class Dog extends AbstractClass{

    @Override
    public void makeSound(){
        System.out.println("Woof Woof...");
    }
    
}

class Cat extends AbstractClass{
    @Override
    public void makeSound(){
        System.out.println("Meow Meow...");
    }
}
class Sheep extends AbstractClass {

    @Override
    public void makeSound() {
        System.out.println("Baa Baa..");
    }
  
}

class Main{
    public static void main(String[] args) {
        AbstractClass dog = new Dog();
        AbstractClass cat = new Cat();
        AbstractClass sheep = new Sheep();

        dog.makeSound();
        dog.move();

        cat.makeSound();
        cat.move();
        
        sheep.makeSound();
        sheep.move();
        

    }
}