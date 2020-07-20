package com.yozzs.algorithms.array;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: liuys23
 * @Date: 2020/7/19
 * 40.最小k个数
 * 最大堆
 */
public class KthLeastNumbers {
    public static void main(String[] args) {
        int[] arr = {9,2,8,5,1,6,3,78,46,9,1,3,4};
        int k = 4;
        System.out.println(Arrays.toString(new KthLeastNumbers().getLeastNumbers(arr, k)));
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k == 0) return new int[]{};
        Queue<Integer> heap = new PriorityQueue<>((o1,o2) -> o2 - o1);
        for (int num : arr) {
            if (heap.size() < k){
                heap.offer(num);
            }else if (heap.size() > 0 && heap.peek() > num){
                heap.poll();
                heap.offer(num);
            }
        }
        int[] result = new int[heap.size()];
        int idx = 0;
        for(int num: heap) {
            result[idx++] = num;
        }
        return result;
    }
}
