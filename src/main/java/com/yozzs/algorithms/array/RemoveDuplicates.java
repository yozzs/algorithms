package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/9/17
 * 26. 删除排序数组中的重复项
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length == 1) return 1;
        int i = 0;
        int j = 0;
        while (j < nums.length){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}
