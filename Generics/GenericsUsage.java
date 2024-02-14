package Generics;

public class GenericsUsage {
    
    // Generic introduce in Java 1.5 to make strong type checking and resuable 
    // Eliminates explicit casting 
    // Enables to design generic algorithms 
    // Generic at class level: Type  Parameter and Type Argument at reference part & empty angular part 
    // Multiple type parameters  i.e public class Color<R,G,B>{  }
    // Generic at method level i.e public <J, W> cockTail(J juice, W water){}
    // PS: NO need to declare at class level to use at method level but for variable - declare at class level 
    // Invoke generic method: obj.mehtod(juice, water)
    // ClassName.<Juice, Water>mehtod(juice, water)

    // Bounded Type Parameters class Glass<T extends Liquid>{} //  we can use extends keyword for both interface and class to set the generic in bounded context
    // Bounded Types - instantiation : interface Liquid{}
    // class Juice implements Liquid{}
    // class Cake{}
    // Glass<Juice> juiceGlass = new Glass(); // ok
    // Glass<Cake> cakeGlass = new Glass();  // wrong

    /* 
        Mutiple Bounded Types: 
        class Glass<T extends Juice & Fluid> {}
        class OrangeJuice extends Juice implements Fluid{}
        class AppleJuice extends Juice{}
        Glass<OrangeJuice> orangeJuiceGlass = new Glass<>(); ok 
        Glass<AppleJuice> appleJuiceGlass = new Glass<>(); not ok
    
    */

    /* Inheritance and Subtyping 

    class Glass<T> {}
    class WineGlass<T> extends Glass<T>{}
    Glass<Wine> wg = new WineGlass<Wine>(); */


}

class Glass<T>{
    public T liquid;
}

class Juice{
    
}
class Water{

}

class Guest{
    public static void main(String[] args) {
        // Glass juiceGlass = new Glass();
        // juiceGlass.liquid = new Juice();

        // Juice juice = (Juice) juiceGlass.liquid;

        // Glass waterGlass = new Glass();
        // waterGlass.liquid = new Water();

        // Water water = (Water)waterGlass.liquid;
        Glass<Juice> juiceGlass = new Glass();
        juiceGlass.liquid = new Juice();

        Juice juice = juiceGlass.liquid;

        Glass<Water> waterGlass = new Glass();
        waterGlass.liquid = new Water();
        Water water = waterGlass.liquid;
        
    }
}