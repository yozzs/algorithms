package com.yozzs.algorithms.sort.impl;


import com.yozzs.algorithms.sort.AbstractSort;

/**
 * @Author: liuys23
 * @Date: 2020/7/19
 * 快速排序
 */
public class QuickSort extends AbstractSort {

    @Override
    public void doSort(int[] arr) {
        if (arr == null || arr.length <= 0) return;
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int start, int end){
        if (start >= end) return;
        int i = start;
        int j = end;
        int temp = arr[i];
        while (i < j){
            while (i < j && arr[j] >= temp){
                j--;
            }
            arr[i] = arr[j];
            while (i < j && arr[i] < temp){
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = temp;
        sort(arr,start,i - 1);
        sort(arr,i + 1,end);
    }

}
