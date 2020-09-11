package com.yozzs.algorithms.bit;

/**
 * @Author: liuys23
 * @Date: 2020/9/9
 * 剑指 Offer 64. 求1+2+…+n
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class SumNums {
    public int sumNums(int n) {
        boolean flag = n >= 1 && (n += sumNums(n-1)) > 1;
        return n;
    }
}
