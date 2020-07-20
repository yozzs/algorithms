package com.yozzs.algorithms.bit;

/**
 * @Author: liuys23
 * @Date: 2020/7/12
 */
public class DoublePow {
    public static void main(String[] args) {
        System.out.println(new DoublePow().myPow(10.00,-2));
    }
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1 / x;
        double result = myPow(x, n >> 1);
        result *= result;
        if ((n & 1) == 1){
            result *= x;
        }
        return result;
    }
}
