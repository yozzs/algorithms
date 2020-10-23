package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/10/21
 */
public class RotateArraySearch {
    public static void main(String[] args) {
        RotateArraySearch rotateArraySearch = new RotateArraySearch();
        System.out.println(rotateArraySearch.test(new int[]{5,6,7,8,9,1,2,3,4}, 4));
    }
    private int test(int[] arr, int target){
        if(arr == null || arr.length == 0) return -1;
        int l = 0;
        int r = arr.length - 1;
        while( l < r ){
            int mid = (l + r) / 2;
            if(arr[mid] > arr[l]){
                if(arr[l] <= target && target <= arr[mid]){
                    r = mid;
                }else {
                    l = mid;
                }
            }else if (arr[mid] < arr[l]){
                if(arr[l] <= target || target <= arr[mid]){
                    r = mid;
                }else{
                    l = mid;
                }
            }else{
                if (arr[l] != target){
                    l++;
                }else {
                    r = l;
                }
            }
        }
        return arr[l] == target ? l : -1;
    }
}
