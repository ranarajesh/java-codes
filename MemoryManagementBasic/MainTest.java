package MemoryManagementBasic;

import java.util.Scanner;
import java.lang.String;

public class MainTest
 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();
        System.out.println("You entered string "+s);
        MyObject myObj = new MyObject();
        MyMemory myMemory = new MyMemory();
        myMemory.myMethod(myObj);
        byte numOne = 122;
        byte numTwo = 34;
        byte result = (byte) (numOne + numTwo);
        System.out.println(result);
        

    }
}
