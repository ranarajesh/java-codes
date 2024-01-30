package Array;
import  java.util.*;
public class MoveZeros {

    private static void moveZerosToLeft(int[] nums) {
        int numsLen = nums.length;
        if(nums.length < 1) return ;
        int readIndex = numsLen -1;
        int writeIndex = numsLen -1;

        while(readIndex >= 0){
            if(nums[readIndex] != 0){
                nums[writeIndex] = nums[readIndex];
                writeIndex--;
            }
            readIndex--;
        }
        while (writeIndex >=0){
            nums[writeIndex] = 0;
            writeIndex--;
        }
    }
    public static void main(String[] args) {
        int[][] numsList = {{1, 10, 20, 0, 59, 63, 0, 88, 0}, {1, 0, 2, 3, 0}, {0},
                {-1, 0, 0, -2, 9}, {1, 2, 3, 4, 5}, {2}};
        for (int i = 0; i < numsList.length; i++) {
            System.out.println((i + 1) + ". Before list:\t" + Arrays.toString(numsList[i]));
            moveZerosToLeft(numsList[i]);
            System.out.println("   After list:\t" + Arrays.toString(numsList[i]));
        }
    }


}
