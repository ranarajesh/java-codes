package Array;

import java.util.Arrays;

public class SumOfThree {
    //Given an array of integers, nums, and an integer value,
    // target, determine if there are any three integers
    // in nums whose sum is equal to the target, that is, nums[i] + nums[j] + nums[k] == target.
    // Return TRUE if three such integers exist in the array. Otherwise, return FALSE.
    public static boolean findSumOfThree(int nums[], int target) {
        // First Sort the array
        Arrays.sort(nums);
        int low, high, triples;
        for(int i=0; i<nums.length-2; i++){
            low = i+1;
            high = nums.length -1;
            while (low < high){
                triples = nums[i] + nums[low] + nums[high];
                if(triples == target){
                    return true;
                }
                low++;
                high--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 2, 8, 4, 5};

        boolean check = SumOfThree.findSumOfThree(arr, 10);
        System.out.println(check);
    }
}
