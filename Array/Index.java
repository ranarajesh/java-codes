package Array;

public class Index {
    public static void main(String[] args){
        System.out.println("Array in Java Programing Language");

        // Int array
        int[] intArray = new int[4];
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Adding and updating elements in Array
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        // System.out.println(intArray[4]); // ArrayIndexOutOfBoundsException

        // Adding Elements using Array literals
        int[] intArrLiteral = {34,5,4,6,8};
        for (int i = 0; i < intArrLiteral.length; i++) {
            System.out.println(intArrLiteral[i]);
        }

        // 2D array in java
        System.out.println("-----2D array in Java-----");
        int[][] in2DArray = new int[3][4];
        in2DArray[0][1] = 20;
        in2DArray[2][1] = 20;

        System.out.println("-------------------");
        int[][] in2dArray1 = new int[10][];
        for (int i = 0; i < in2dArray1.length; i++) {
            in2dArray1[i] = new int[10];
            for (int j = 0; j < in2dArray1[i].length; j++) {
                in2dArray1[i][j] = i+j;
                System.out.println(in2dArray1[i][j]);
            }
        }

    }
}
