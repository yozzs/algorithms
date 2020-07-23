package com.yozzs.algorithms.dp;

/**
 * @Author: liuys23
 * @Date: 2020/7/21
 * 46. 把数字翻译成字符串
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11
 * 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，
 * 用来计算一个数字有多少种不同的翻译方法。
 * dp
 */
public class TranslateNum {
    public int translateNum(int num) {
        String str = String.valueOf(num);
        int[] dp = new int[str.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= str.length(); i++) {
            String s = str.substring(i - 2, i);
            int temp = Integer.parseInt(s);
            if (temp < 10 || temp > 25){
                dp[i] = dp[i - 1];
            }else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[dp.length - 1];
    }
}
