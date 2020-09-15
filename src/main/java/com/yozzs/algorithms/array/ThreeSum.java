package com.yozzs.algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: liuys23
 * @Date: 2020/9/15
 * 15. 三数之和
 * 排序，遍历，双指针
 */
public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] ints = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum.threeSum(ints));

    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3){
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r){
                int temp = nums[i] + nums[l] + nums[r];
                if (temp == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    result.add(list);
                    while (l < r && nums[l] == nums[l + 1]){ l++; }
                    while (l < r && nums[r] == nums[r - 1]){ r--; }
                    l++;
                    r--;
                }else if (temp < 0){
                    l++;
                }else {
                    r--;
                }
            }
        }
        return result;
    }
}
