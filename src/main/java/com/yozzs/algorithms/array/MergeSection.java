package com.yozzs.algorithms.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: liuys23
 * @Date: 2020/10/17
 * 合并区间
 */
public class MergeSection {
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
