package com.yozzs.algorithms.array;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: liuys23
 * @Date: 2020/10/22
 * 42. 接雨水
 *
 */
public class Trap {
    public static void main(String[] args) {
        System.out.println(new Trap().trap1(new int[]{4,2,0,3,2,5}));
        System.out.println(new Trap().trap2(new int[]{4,2,0,3,2,5}));
        System.out.println(new Trap().trap3(new int[]{4,2,0,3,2,5}));
    }

    //解法1：动态规划 On On
    public int trap1(int[] height) {
        if(height == null || height.length < 3) return 0;
        int len = height.length;
        int[] lmax = new int[len];
        int[] rmax = new int[len];
        int[] res = new int[len];
        int result = 0;
        lmax[0] = 0;
        rmax[len - 1] = 0;
        res[0] = 0;
        res[len - 1] = 0;
        for(int i = 1; i < len; i++){
            lmax[i] = Math.max(lmax[i-1], height[i-1]);
        }
        System.out.println(Arrays.toString(lmax));
        for(int i = len - 2; i >= 0; i--){
            rmax[i] = Math.max(rmax[i+1], height[i+1]);
        }
        System.out.println(Arrays.toString(rmax));
        for(int i = 1; i < len - 1; i++){
            int minMax = Math.min(lmax[i], rmax[i]);
            res[i] = Math.max(minMax - height[i], 0);
        }
        System.out.println(Arrays.toString(res));
        for(int i = 0; i < len; i++){
            result += res[i];
        }
        return result;
    }

    //解法2：单调栈 On On
    //用单调递减栈保存左边界，到遇到大于栈顶元素的柱子，计算面积
    public int trap2(int[] height) {
        if(height == null || height.length < 3) return 0;
        Deque<Integer> stack = new LinkedList<>();
        int i = 0;
        int res = 0;
        while(i < height.length){
            while(!stack.isEmpty() && height[i] > height[stack.peek()]){
                int pop = stack.pop();
                if (stack.isEmpty()) break;
                int left = stack.peek();
                res += (i - left - 1) * (Math.min(height[left], height[i]) - height[pop]);
            }
            stack.push(i++);
        }
        return res;
    }

    //解法3：双指针 On O1
    public int trap3(int[] height) {
        if(height == null || height.length < 3) return 0;
        int l = 0 , r = height.length - 1;
        int lmax = 0, rmax = 0, res = 0;
        while(l < r){
            if (height[l] < height[r]){
                if (height[l] < lmax){
                    res += lmax - height[l];
                }
                lmax = Math.max(height[l], lmax);
                l++;
            }else{
                if (height[r] < rmax){
                    res += rmax - height[r];
                }
                rmax = Math.max(height[r], rmax);
                r--;
            }
        }
        return res;
    }

}
