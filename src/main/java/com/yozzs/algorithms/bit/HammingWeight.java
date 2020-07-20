package com.yozzs.algorithms.bit;

/**
 * @Author: liuys23
 * @Date: 2020/7/12
 * 求无符号数n的二进制数中1的位数
 */
public class HammingWeight {
    public static void main(String[] args) {
        int a = 0b011111111111111111111111111111101;
        System.out.println(new HammingWeight().hammingWeight(a));
    }
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
