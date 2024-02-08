package Array;

import java.util.Arrays;

public class FindMinInRotateArray {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] < nums[left]){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[][] arr = {{5,1,2,3,4}, {3,4,5,0,1,2}};
        for (int[] is : arr) {
            System.out.println(findMin(is));
        }
    }

}
