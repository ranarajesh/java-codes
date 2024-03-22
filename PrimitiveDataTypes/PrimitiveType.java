package PrimitiveDataTypes;

public class PrimitiveType {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean bl;
    static char c;
    public static void main(String[] args) {
        System.out.println("b :"+b);
        System.out.println("s :"+s);
        System.out.println("i :"+i);
        System.out.println("l :"+l);
        System.out.println("f :"+f);
        System.out.println("d :"+d);
        System.out.println("bl: "+bl);
        System.out.println("c :"+c);

        // In Java, a wrapper class is a class that encapsulates (or wraps) a primitive data type within an object. This allows primitive data types to be used as objects, enabling them to be included in activities that require objects, such as collections, generics, and method overloading.

        System.out.println("b :"+new Byte(b));
        System.out.println("s :"+new Short(s));
        Syste