package ConsoleInput;

import java.util.Scanner;

public class ScannerClass {
    
    public static void main(String[] args) {
        System.out.println("Please enter the text from console or keyboard to show back to console.");
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        System.out.println(s);
        
    }
}
