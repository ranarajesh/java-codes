package Array.medium;

public class FindAvgOfSubArray {
    public static double[] findMaxAverage(int[] nums, int k) {
        int windowStart=0;
        double windowSum = 0;
        double[] result = new double[nums.length - k + 1];
        for(int windowEnd =0; windowEnd<nums.length; windowEnd++){
            windowSum += nums[windowEnd];

            if( windowEnd >= k-1){
                System.out.println("Before decreemnt "+windowSum);
                double avg = windowSum/k;
                System.out.println("Average  "+avg);
                result[windowStart] = avg;
                windowSum -= nums[windowStart];
                System.out.println("After decreemnt "+windowSum);
                windowStart++;
            }
        }
        return result;
    }

    public static  void main(String[] arg){
        int[] arr = new int[]{1, 3, 2, 6,-1, 4, 1, 8, 2};
        int k=  5;
        double[] result = FindAvgOfSubArray.findMaxAverage(arr, k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
