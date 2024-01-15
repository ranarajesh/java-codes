package Array.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int targetNum = target - nums[i];
            if(numToIndex.containsKey(targetNum)){
                return new int[]{i, numToIndex.get(targetNum)};
            }
            numToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }

}
