package com.yozzs.algorithms.sort;

/**
 * @Author: liuys23
 * @Date: 2020/7/23
 */
public interface Sort {
    /**
     * sort
     * @param arr input int array
     */
    void sort(int[] arr);

    /**
     * is sorted
     * @param arr input int array
     * @return is sorted
     */
    boolean isSorted(int[] arr);

    /**
     * print array
     * @param arr input int array
     */
    void show(int[] arr);
}
