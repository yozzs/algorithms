package com.yozzs.algorithms.sort.impl;

import com.yozzs.algorithms.sort.AbstractSort;

/**
 * @Author: liuys23
 * @Date: 2020/7/23
 * 希尔排序
 */
public class ShellSort extends AbstractSort {

    @Override
    public void doSort(int[] arr) {
        int length = arr.length;
        int h = 1;
        while (h < length / 3){
            h = h * 3 + 1;
        }
        while (h >= 1){
            for (int i = h; i < length; i++) {
                for (int j = i; j > h; j -= h ) {
                    if (arr[j] < arr[j - h]){
                        swap(arr, j, j - h);
                    }
                }
            }
            h = h / 3;
        }
    }
}
