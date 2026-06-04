// time: O(n)
// space: O(1)

class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] arr) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<arr.length; i++){
            if(buyPrice > arr[i]) buyPrice = arr[i];
            else {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}