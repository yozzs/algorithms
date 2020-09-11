package com.yozzs.algorithms.array;

import java.util.ArrayList;

/**
 * @Author: liuys23
 * @Date: 2020/9/10
 * 剑指 Offer 57 - II. 和为s的连续正数序列
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 */
public class ContinunousSequence {
    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int l = 0, r = 0, sum = 0; l < r && r <= target ; r++) {
            sum += r;
            while (sum > target){
                sum -= l++;
            }
            if (sum == target){
                int[] temp = new int[r - l + 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = l + i;
                }
                list.add(temp);
            }
        }
        int[][] result = new int[list.size()][];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
