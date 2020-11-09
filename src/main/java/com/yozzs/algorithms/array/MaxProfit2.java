package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/11/8
 * 122. 买卖股票的最佳时机 II
 */
public class MaxProfit2 {
    public int maxProfit(int[] prices){
        int res = 0;
        int len = prices.length;
        for (int i = 1; i < prices.length; i++) {
            res += Math.max(0, prices[i] - prices[i - 1]);
        }
        return res;
    }
}
