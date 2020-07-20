package com.yozzs.algorithms.binarysearch;

/**
 * @Author: liuys23
 * @Date: 2020/7/10
 * 旋转数组找最小值
 * tips：二分查找法
 */
public class CycleArray {
    public static void main(String[] args) {
        CycleArray cycleArray = new CycleArray();
        int[] numbers = {3,4,5,6,7,0,1,2};
        System.out.println(cycleArray.minArray(numbers));
    }
    public int minArray(int[] numbers) {
        int length = numbers.length;
        int left = 0;
        int right = length - 1;
        while (left < right){
            int mid = left + (right - left)/2;
            if (numbers[mid] < numbers[right]){
                right = mid;
            }else if (numbers[mid] > numbers[right]){
                left = mid + 1;
            }else {
                right--;
            }
        }
        return numbers[left];
    }
}
