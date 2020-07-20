package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/7/8
 * 在一个长度为n的数组里所有数字都在0~n-1范围内，判断数组是否有重复数字
 */
public class RepetitiveInt {
    public static void main(String[] args) {
        int[] arr = {2,3,1,0,2,5,3};
        System.out.println(hasRepetitiveInt1(arr));
    }
    private static int hasRepetitiveInt1(int[] arr){
        if (arr == null ){
            return -1;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < 0 || arr[i] > arr.length - 1){
                return -1;
            }
            while (arr[i] != i){
                if (arr[i] == arr[arr[i]]){
                    return arr[i];
                }
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
        return -1;
    }
}
