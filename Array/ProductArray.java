import java.sql.Array;
import java.util.Arrays;

class ProductArray  
{  
  public static int[] findProduct(int[] nums)  
  { 
        int numsLen = nums.length;
        int[] ans = new int[numsLen];
        ans[0] = 1;
        for(int i=1; i<numsLen; ++i){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int prod = 1;
        for(int i=numsLen-1; i>=0; --i){
            ans[i] = ans[i] * prod;
            prod = prod * nums[i];
        }
        return ans; 
  } 
  public static String arrayToString(int arr[]){
    if (arr.length > 0){
      String result = "";
      for(int i = 0; i < arr.length; i++) {
        result += arr[i] + " ";
      }
      return result;
    }
    else {
      return "Empty Array!";
    }
  }

  public static void main(String args[]) {

    int[][] arr = {{1,2,3,4},{-1, 2, -3, 4, -5}};
    for (int[] is : arr) {
      System.out.print(Arrays.toString(is));
      System.out.println("-->"+Arrays.toString(findProduct(is)));
    }
  }
} 