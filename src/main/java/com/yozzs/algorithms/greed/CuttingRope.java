package com.yozzs.algorithms.greed;

/**
 * @Author: liuys23
 * @Date: 2020/7/12
 * 一段长为n的绳子，剪成m段(m>1,n>1)，求m段绳子长度乘积的可能最大值
 * 动态规划 或 贪心算法
 */
public class CuttingRope {
    public static void main(String[] args) {
        CuttingRope cuttingRope = new CuttingRope();
        System.out.println(cuttingRope.cuttingRope(33));
        System.out.println(cuttingRope.cuttingRope1(33));
    }
    public int cuttingRope(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        // 尽量多砍出长度为3的绳子段，如果最后一段长为4，则砍为2*2
        int timeOf3 = n % 3 == 1 ? n / 3 - 1 : n / 3;
        int timeOf2 = n % 3 == 1 ? 2 : n % 3 == 2 ? 1 : 0;

        int resultult3 = 1;
        int resultult2 = 1;
        while (timeOf3-- > 0){
            resultult3 *= 3;
        }
        while (timeOf2-- > 0){
            resultult2 *= 2;
        }
        return resultult2 * resultult3;
    }
    //优化代码
    public int cuttingRope1(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        long result = 1;
        while(n > 4){
            result *= 3;
            n -= 3;
        }
        return (int)(result * n);
    }
    
}
