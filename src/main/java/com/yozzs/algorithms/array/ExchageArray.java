package com.yozzs.algorithms.array;

import java.util.Arrays;

/**
 * @Author: liuys23
 * @Date: 2020/7/12
 * 调整数组顺序，使所有奇数在前，偶数在后
 */
public class ExchageArray {
    public static void main(String[] args) {
        ExchageArray exchageArray = new ExchageArray();
        int[] nums = {1,6,3,8,5,2,9,0};
        System.out.println(Arrays.toString(exchageArray.exchange(nums)));
    }
    public int[] exchange(int[] nums) {
        if (nums.length <= 1) return nums;
        int lIndex = 0;
        int rIndex = nums.length - 1;
        while (lIndex < rIndex){
            while (lIndex < rIndex && (nums[lIndex] & 1) != 0){
                lIndex++;
            }
            while (lIndex < rIndex && (nums[rIndex] & 1) == 0){
                rIndex--;
            }
            int temp = nums[lIndex];
            nums[lIndex] = nums[rIndex];
            nums[rIndex] = temp;
        }
        return nums;
    }
}
