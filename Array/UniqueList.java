package Array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueList {
    public static void main(String[] arg){
        int[] arr = new int[] { 4,2,3,2,1,4,5,7};
        System.out.println(Arrays.toString(arr));
        int[] uniqueList = makeUnique(arr);
        System.out.println(Arrays.toString(uniqueList));
    }

    private static int[] makeUnique(int[] arr) {
       int readIndex = 0;
       int writeIndex =0;

       Set<Integer> hasSet = new LinkedHashSet<>();

       while(readIndex != arr.length){
            if(!hasSet.contains(arr[readIndex])){
                hasSet.add(arr[readIndex]);
                arr[writeIndex] = arr[readIndex];
                writeIndex++;
            }
            readIndex++;
       }
       return Arrays.copyOfRange(arr, 0, writeIndex);
    }
}
