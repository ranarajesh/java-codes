package Array;

import java.util.Arrays;

public class SortedSquareArray {

    public static int[] sortSquareEfficient(int[] arr){
        int[] output = new int[arr.length];
        int left = 0;
        int right = arr.length -1;
        for (int i = arr.length -1; i>=0 ; i--) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if(leftSquare > rightSquare){
                output[i] = leftSquare;
                left++;
            }else{
                output[i] = rightSquare;
                right--;
            }
        }
        return output;
    }
    private static int[] sortSquareByBruteForce(int[] arr) {
        int[] output = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            output[i] = arr[i] * arr[i];
        }
        Arrays.sort(output);
        return output;
    }
    public static void main(String[] args) {
        int[] arr = {-6,-4, 1,2,3,5};
        System.out.println("sortSquareByBruteForce(arr) "+ Arrays.toString(sortSquareByBruteForce(arr)));
        System.out.println("sortSquareEfficient(arr) "+ Arrays.toString(sortSquareEfficient(arr)));

    }
}
