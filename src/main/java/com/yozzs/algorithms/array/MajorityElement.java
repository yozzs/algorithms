package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/7/19
 * 39.数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * tips: 排序之后数组中间位置就是该数字
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(new MajorityElement().majorityElement(arr));
    }

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length <= 0) return -1;
        quickSort(nums, 0, nums.length - 1);
        return nums[nums.length >> 1];
    }

    //快排
    private void quickSort(int[] arr, int start, int end){
        if (start >= end) return;
        int i = start;
        int j = end;
        int temp = arr[i];
        while (i < j){
            while (i < j && arr[j] >= temp){
                j--;
            }
            arr[i] = arr[j];
            while (i < j && arr[i] < temp){
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = temp;
        quickSort(arr,start,i - 1);
        quickSort(arr,i + 1,end);
    }
}
