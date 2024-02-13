package OOPs.methods;

public class MethodOverload {
    // Overloading method refers to making a method perform different operations based on the nature of its arguments 
    // We could redefine a method several times and give it different arguments and method types. When the method is called, the appropriate definition will be selected by the compiler. 

    // the benefits of method overloading in that code becomes simple and clean , we don't have to keep track of different methods. and it also helps to achieve polymorphism in OOPs using its implementation.

    public double product(double x, double y){
        return x*y;
    }

    public double product(double x , double y , double z){ // Here overlaoding to handle three arguments
        return x* y* z;
    }

    // Overloading the function to handle int
    public int product(int x, int y){
        return x * y;
    }

    public static void main(String[] args) {
        MethodOverload overload = new MethodOverload();
        System.out.println(overload.product(12, 13));
        System.out.println(overload.product(12.34, 13.34));
        System.out.println(overload.product(12.564, 13.54));
        System.out.println(overload.product(45.34, 930.4));
    }

}
