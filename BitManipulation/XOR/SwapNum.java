
public class SwapNum{

    public static void SwapNum(int a , int b){
        System.out.println(a);
        System.out.println(b);
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("______________________");
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] arg){
        SwapNum(24, 16);
    }
}