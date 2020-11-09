package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/10/26
 * 1365. 有多少小于当前数字的数字
 */
public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] == 0 ? 0 : count[nums[i] - 1];
        }
        return res;
    }
}
