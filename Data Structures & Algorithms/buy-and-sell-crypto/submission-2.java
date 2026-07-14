class Solution {
    public int maxProfit(int[] prices) {
        // // Brute Force approach - O(N^2)
        // int max_profit = 0;
        // for (int i = 0; i < prices.length-1; i++) {
        //     for (int j = i + 1; j < prices.length; j++) {
        //         if (prices[j] > prices[i]) {
        //             int profit = prices[j] - prices[i];
        //             if (profit > max_profit)
        //                 max_profit = profit;
        //         }
        //     }
        // }
        // return max_profit;

        // Better
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            if (currentPrice < minPrice)
                minPrice = currentPrice;
            int currentProfit = currentPrice - minPrice;
            if (currentProfit > maxProfit)
                maxProfit = currentProfit;
        }

        return maxProfit;

    }
}
