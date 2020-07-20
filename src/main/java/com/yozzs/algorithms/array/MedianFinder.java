package com.yozzs.algorithms.array;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: liuys23
 * @Date: 2020/7/19
 * 41.从数据流中找中位数，实现插入方法，和返回中位数方法
 * tips：最大堆+最小堆
 */
public class MedianFinder {
    Queue<Integer> maxHeap;
    Queue<Integer> minHeap;
    /** initialize your data structure here. */
    public MedianFinder() {
        maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        minHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);
    }

    public void addNum(int num) {
        int size = maxHeap.size() + minHeap.size();
        if ((size & 1) == 0){ // 偶数，插入最小堆
            if (maxHeap.size() > 0 && num <= maxHeap.peek()){
                maxHeap.offer(num);
                minHeap.offer(maxHeap.poll());
            }else {
                minHeap.offer(num);
            }
        }else { // 奇数，插入最大堆
            if (minHeap.size() > 0 && num >= minHeap.peek()){
                minHeap.offer(num);
                maxHeap.offer(minHeap.poll());
            }else {
                maxHeap.offer(num);
            }
        }
    }

    public double findMedian() {
        int size = maxHeap.size() + minHeap.size();
        if (maxHeap.size() <= 0 && minHeap.size() <= 0){
            throw new RuntimeException("no available data");
        }else if (maxHeap.size() <= 0){
            return minHeap.peek();
        }else if (minHeap.size() <= 0){
            return maxHeap.peek();
        }

        if ((size & 1) == 1){
            return minHeap.peek();
        }else {
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        }
    }
}
