package Array;

public class SmallestSubArrSum {
    public static int smallestSubArr(int[] arr, int target){
        int result = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            while (windowSum >= target){
                result = Math.min(result, windowEnd - windowStart +1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }
    public static void  main(String[] arg){
        int[][] arr= new int[][]{{2,1,5,1,3}, {2,3,4,1,5}};
        int[] k = new int[]{7,10};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(SmallestSubArrSum.smallestSubArr(arr[i], k[i]));
        }
    }
}
