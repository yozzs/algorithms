package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/9/9
 * 剑指 Offer 63. 股票的最大利润
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min){
                min = prices[i];
            }else {
                profit = Math.max(prices[i] - min, profit);
            }
        }
        return profit;
    }
}
