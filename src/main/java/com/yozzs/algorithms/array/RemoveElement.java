package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/9/17
 * 27. 移除元素
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null) return 0;
        int i = 0;
        int j = 0;
        while (j < nums.length){
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
