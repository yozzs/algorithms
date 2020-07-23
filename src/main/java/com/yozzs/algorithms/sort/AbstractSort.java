package com.yozzs.algorithms.sort;

import java.util.Arrays;

/**
 * @Author: liuys23
 * @Date: 2020/7/23
 */
public abstract class AbstractSort implements Sort {

    @Override
    public void sort(int[] arr){
        if (arr == null || arr.length <= 0) return;
        doSort(arr);
    }

    @Override
    public boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) return false;
        }
        return true;
    }

    @Override
    public void show(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    
    protected abstract void doSort(int[] arr);

    protected void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
