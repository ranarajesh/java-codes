package Array.medium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueList {
    public static void main(String[] arg){
        System.out.println(13>>>1);
        System.out.println(13>>1);

        int[] arr = new int[] { 4,2,3,2,1,4,5,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
       makeUnique(arr);
       System.out.println(Arrays.toString(arr));
    }

    private static void makeUnique(int[] arr) {
        int p1 = 0;
        int p2 =1;
        int j = arr.length -1;
        while (p2 < j){
            if(arr[p1] == arr[p2]){
                // swap the arr[p2] with arr[j]
                int temp = arr[p2];
                arr[p2] = arr[j];
                arr[j] = temp;
                p1= p2-1;
                j--;
            }
            if(arr[p2] != arr[p1]){
                int temp = arr[p2];
                arr[p2] = arr[p2-1];
                arr[p2-1] = temp;
            }
            p2++;
        }
        System.out.println(p1);
    }
}
