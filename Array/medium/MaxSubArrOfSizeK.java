package Array.medium;

public class MaxSubArrOfSizeK {
    public static int maxSubArrOfSizeK(int k, int[] nums){
        int maxResult = 0;
        int windowSum = 0;
        int windowStart=0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];
            if(windowEnd >=  k -1){
                maxResult = Integer.max(maxResult, windowSum);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        return maxResult;
    }

    public  static  void  main(String[] arg){
        int[][] arr= new int[][]{{2,1,5,1,3}, {2,3,4,1,5}};
        int[] k = new int[]{3,2};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(MaxSubArrOfSizeK.maxSubArrOfSizeK(k[i], arr[i]));
        }
    }
}
