package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/8/4
 * 57. 输入一个递增排序的数组和一个数字s，在数组中查找两个数，
 * 使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * 双指针
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[lo] + nums[hi];
            if (sum < target) {
                lo++;
            } else if (sum > target) {
                hi--;
            } else return new int[] {nums[lo], nums[hi]};
        }
        return new int[] {-1, - 1};
    }
}
