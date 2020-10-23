package com.yozzs.algorithms.string;

/**
 * @Author: liuys23
 * @Date: 2020/10/18
 * 674. 最长连续递增序列
 */
public class findLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int res = 1;
        int length = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i - 1]){
                res = Math.max(res, length);
                length = 0;
            }
            length++;
        }
        return Math.max(res, length);
    }
}
