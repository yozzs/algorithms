package com.yozzs.algorithms.sort.impl;

import com.yozzs.algorithms.sort.AbstractSort;

/**
 * @Author: liuys23
 * @Date: 2020/7/23
 * 选择排序
 */
public class SelectionSort extends AbstractSort {

    @Override
    public void doSort(int [] nums){
        if (nums == null || nums.length <= 0) return;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]){
                    swap(nums, i, j);
                }
            }
        }
    }

}
