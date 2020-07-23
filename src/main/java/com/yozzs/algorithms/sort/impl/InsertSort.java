package com.yozzs.algorithms.sort.impl;

import com.yozzs.algorithms.sort.AbstractSort;

/**
 * @Author: liuys23
 * @Date: 2020/7/23
 * 插入排序
 */
public class InsertSort extends AbstractSort {

    @Override
    public void doSort(int[] arr) {
        if (arr == null || arr.length <= 0) return;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
}
