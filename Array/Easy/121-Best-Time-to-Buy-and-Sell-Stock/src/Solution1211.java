/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction
 * (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * Note that you cannot sell a stock before you buy one.
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class Solution1211 {
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(new Solution1211().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        /**
         * 思路：最简单的就是直接使用俩层循环
         * 外层循环遍历天数 内层循环计算利润
         */
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int tmp = prices[j] - prices[i];
                if (tmp >= maxProfit){
                    maxProfit = tmp;
                }
            }
            if (maxProfit <= 0) {
                maxProfit = 0;
            }
        }
        return maxProfit;
    }
}
