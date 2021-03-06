import java.util.*;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (i.e., buy one and sell one share of the stock multiple times).
 * Note: You may not engage in multiple transactions at the same time
 * (i.e., you must sell the stock before you buy again).
 *
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 *
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 * engaging multiple transactions at the same time. You must sell before buying again.
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */

public class Solution1222 {
    public static void main(String[] args) {
        int[] prices = {2,1,2,0,1};
        System.out.println(new Solution1222().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxProfit = 0; // 最终的最大利润
        List<Integer> maxProfits = new ArrayList<>(); // 用于保存每次获得的最大值
        int sofarMin = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int tempProfit = prices[i] - sofarMin;
            if (prices[i] > sofarMin) {
                if (maxProfit >  tempProfit) {
                    maxProfits.add(Math.max(maxProfit, tempProfit));
                    sofarMin = prices[i];
                    maxProfit = 0;
                } else {
                    maxProfit = Math.max(maxProfit, tempProfit);
                }
            } else {
                if (maxProfit >  tempProfit) {
                    maxProfits.add(Math.max(maxProfit, tempProfit));
                    sofarMin = prices[i];
                    maxProfit = 0;
                }else {
                    sofarMin = prices[i];
                }
            }
        }

        Iterator iterator = maxProfits.iterator(); // 用于将最后的结果累加
        while (iterator.hasNext()) {
            maxProfit = maxProfit + (int)iterator.next();
        }
        return maxProfit;
    }
}
