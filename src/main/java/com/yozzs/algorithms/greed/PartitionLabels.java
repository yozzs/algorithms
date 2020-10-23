package com.yozzs.algorithms.greed;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liuys23
 * @Date: 2020/10/23
 * 763. 划分字母区间
 */
public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        //保存字母最后出现的下标
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        List<Integer> res = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end){
                res.add(end - start + 1);
                start = end + 1;
            }
        }
        return res;
    }
}
