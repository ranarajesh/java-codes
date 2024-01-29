package Array;
//Find the Duplicate Number
//   Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//   There is only one repeated number in nums, return this repeated number.
//
//  You must solve the problem without modifying the array nums and uses only constant extra space.
public class FindDuplicateNumber {
        public static int findDuplicate(int[] nums) {
            int fast = nums[0];
            int slow = nums[0];

            while (true) {
                slow = nums[slow];
                fast = nums[nums[fast]];

                if (slow == fast) {
                    break;
                }
            }

               slow = nums[0];

               while (slow != fast) {
                   slow = nums[slow];
                   fast = nums[fast];
               }

            return fast;
        }
}
