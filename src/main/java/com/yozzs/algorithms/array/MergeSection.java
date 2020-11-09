package com.yozzs.algorithms.array;

import java.util.*;

/**
 * @Author: liuys23
 * @Date: 2020/10/17
 * 56. 合并区间
 */
public class MergeSection {

    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        int i = 0;
        while(i < intervals.length){
            int start = intervals[i][0];
            int end = intervals[i][1];
            while(i < intervals.length -1 && end >= intervals[i + 1][0]){
                end = Math.max(end, intervals[i+1][1]);
                i++;
            }
            list.add(new int[]{start, end});
            i++;
        }
        return list.toArray(new int[list.size()][]);
    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> res = new ArrayList<>();
        Collections.sort(intervals, Comparator.comparingInt(o -> o.start));
        int len = intervals.size();
        int i = 0;
        while(i < len){
            int start = intervals.get(i).start;
            int end = intervals.get(i).end;
            while(i < len - 1 && end >= intervals.get(i + 1).start){
                end = Math.max(end, intervals.get(i + 1).end);
                i++;
            }
            i++;
            res.add(new Interval(start, end));
        }
        return res;
    }

    class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}
