package com.yozzs.algorithms.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @Author: liuys23
 * @Date: 2020/9/7
 * 84. 柱状图中最大的矩形
 */
public class LargestRectangleArea {
    public static void main(String[] args) {
        LargestRectangleArea context = new LargestRectangleArea();
        int[] ints = {2, 1, 5, 6, 2, 3};
        System.out.println(context.largestRectangleArea(ints));
    }

    public int largestRectangleArea(int[] heights) {
        int[] temp = new int[heights.length + 2];
        System.arraycopy(heights, 0, temp, 1, heights.length);
        Deque<Integer> stack = new ArrayDeque<>();
        int area = 0;
        for (int i = 0; i < temp.length; i++) {
            while (!stack.isEmpty() && temp[i] < temp[stack.peek()]){
                int h = temp[stack.pop()];
                area = Math.max(area, (i - stack.peek() - 1) * h);
            }
            stack.push(i);
        }
        return area;
    }
}
