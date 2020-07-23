package com.yozzs.algorithms.sort.impl;

import com.yozzs.algorithms.sort.AbstractSort;

/**
 * @Author: liuys23
 * @Date: 2020/7/23
 * 归并排序
 */
public class MergeSort extends AbstractSort {

    @Override
    protected void doSort(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        mergeSort(arr, l, r);
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        int[] temp = new int[arr.length];
        for (int k = l; k <= r; k++) {
            temp[k] = arr[k];
        }
        for (int k = l; k <= r; k++) {
            if (j > r){
                arr[k] = temp[i++];
            }else if (i > mid){
                arr[k] = temp[j++];
            }else if (temp[j] < temp[i]){
                arr[k] = temp[j++];
            }else {
                arr[k] = temp[i++];
            }
        }
    }


}
