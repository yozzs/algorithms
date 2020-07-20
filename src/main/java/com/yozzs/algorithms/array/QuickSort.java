package com.yozzs.algorithms.array;

import java.util.Arrays;

/**
 * @Author: liuys23
 * @Date: 2020/7/19
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,5,9,3,6,3,8,9,1,6,2,8};
        System.out.println(Arrays.toString(new QuickSort().quickSort(arr)));
    }
    public int[] quickSort(int[] arr){
        if (arr == null || arr.length <= 0) return null;
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    public void quickSort(int[] arr, int start, int end){
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
        quickSort(arr,start,i - 1);
        quickSort(arr,i + 1,end);
    }
}
