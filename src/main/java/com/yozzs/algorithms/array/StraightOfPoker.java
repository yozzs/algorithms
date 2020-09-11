package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/9/9
 * 剑指 Offer 61. 扑克牌中的顺子
 */
public class StraightOfPoker {
    public boolean isStraight(int[] nums) {
        int[] bucket = new int[14];
        int min = 14;
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            if (bucket[nums[i]] >= 1) return false;
            bucket[nums[i]]++;
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return max - min <= 4;
    }
}
