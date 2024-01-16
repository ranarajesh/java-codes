package Array.medium;

public class BuySellStock {

    public static int sellStockProfit(int[] pricess){
        // 1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9
        int buy = pricess[0];
        int profit = 0;
        for (int i = 1;  i< pricess.length ; i++) {
            if(buy > pricess[i]){
                buy = pricess[i];
            }else if(pricess[i] - buy > profit){
                profit = pricess[i] - buy;
            }

        }
        return profit;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9};
        System.out.println(BuySellStock.sellStockProfit(arr));
    }
}
