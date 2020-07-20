package com.yozzs.algorithms.dp;

/**
 * @Author: liuys23
 * @Date: 2020/7/12
 * 一段长为n的绳子，剪成m段(m>1,n>1)，求m段绳子长度乘积的可能最大值
 * 动态规划 或 贪心算法
 */
public class CuttingRope {
    public static void main(String[] args) {
        CuttingRope cuttingRope = new CuttingRope();
        System.out.println(cuttingRope.cuttingRope(10));
    }
    public int cuttingRope(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int[] dp = new int[n + 1];
        // 记录对应长度的绳子可得到的最大值
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        int max = 0;
        for (int i = 4; i <= n; i++) {
            max = 0;
            for (int j = 1; j <= i/2; j++) {
                int product = dp[j] * dp[i - j];
                max = Math.max(product, max);
            }
            dp[i] = max;
        }
        return dp[n];
    }
}
