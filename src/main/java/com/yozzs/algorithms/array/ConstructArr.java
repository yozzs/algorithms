package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/9/10
 * 剑指 Offer 66. 构建乘积数组
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，
 * 其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 */
public class ConstructArr {
    public int[] constructArr(int[] a) {
        if (a == null || a.length == 0) return new int[]{};
        int[] result = new int[a.length];
        for (int i = 0, temp = 1; i < a.length; temp *= a[i], i++) {
            result[i] = temp;
        }
        for (int i = a.length - 1, temp = 1; i >= 0; temp *= a[i], i--) {
            result[i] *= temp;
        }
        return result;
    }
}
