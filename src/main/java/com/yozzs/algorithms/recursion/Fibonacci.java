package com.yozzs.algorithms.recursion;

/**
 * @Author: liuys23
 * @Date: 2020/7/10
 * 斐波那契数列第n项（从0开始）
 */
public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(48));
    }
    public int fib(int n) {
        int n0 = 0;
        int n1 = 1;
        if (n == 0){return n0;}
        if (n == 1){return n1;}
        int i = 2;
        int result = -1;
        while (i <= n){
            result = (n0 + n1)  % 1000000007;
            n0 = n1;
            n1 = result;
            i++;
        }
        return result;
    }
    /*递归效率低*/
    public int fibByRecursion(int n) {
        if (n < 2) return n;
        return (fibByRecursion(n-1) + fibByRecursion(n-2)) % 1000000007;
    }
}
