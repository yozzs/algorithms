package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/7/19
 * 39.数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * tips: 对冲
 */
public class MajorityElement2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(new MajorityElement2().majorityElement(arr));
    }

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length <= 0) return -1;
        int result = nums[0];
        int times = 0;
        for (int num : nums) {
            if (num == result) {
                times++;
            } else if (times > 0) {
                times--;
            } else {
                result = num;
                times++;
            }
        }
        return result;
    }


}
