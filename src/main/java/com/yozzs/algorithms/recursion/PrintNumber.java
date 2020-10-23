package com.yozzs.algorithms.recursion;

import java.util.Arrays;

/**
 * @Author: liuys23
 * @Date: 2020/7/12
 * 输入n，输出从1到最大的n位数
 * 全排列
 */
public class PrintNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PrintNumber().printNumbers(3)));
    }
    public int[] printNumbers(int n) {
        if (n <= 0) return null;
        int length = 1;
        for (int i = 1; i <= n; i++) {
            length *= 10;
        }
        int[] numbers = new int[length - 1];
        for (int i = 0; i < length - 1; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
}
