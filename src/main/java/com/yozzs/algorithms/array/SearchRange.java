package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/10/21
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int mid = (l + r)/2;
            if(nums[mid] > target){
                r = mid - 1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                l = mid;
                r = mid;
                while(l >= 0 && nums[l] == target){
                    l--;
                }
                while(r < nums.length && nums[r] == target){
                    r++;
                }
                return new int[]{++l, --r};
            }
        }
        return new int[]{-1,-1};
    }
}
