package com.yozzs.algorithms.array;

/**
 * @Author: liuys23
 * @Date: 2020/10/25
 * 845. 数组中的最长山脉
 */
public class LongestMountain {
    public int longestMountain(int[] a) {
        if(a == null || a.length <= 2){
            return 0;
        }
        int res = 0;
        int len = a.length;
        int[] left = new int[len];
        int[] right = new int[len];

        for(int i = 1; i < len; i++ ){
            left[i] = a[i] > a[i - 1] ? left[i - 1] + 1 : 0;
        }
        for(int i = len - 2; i >= 0; i-- ){
            right[i] = a[i] > a[i + 1] ? right[i + 1] + 1 : 0;
        }
        for(int i = 0; i < len; i++){
            if(left[i] > 0 && right[i] > 0){
                res = Math.max(res, (left[i] + right[i] + 1));
            }
        }
        return res;
    }
}
