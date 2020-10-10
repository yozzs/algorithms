package com.yozzs.algorithms.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: liuys23
 * @Date: 2020/9/24
 */
public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : nums) {
            list.add(a);
        }
        helper(list, res, 0);
        return res;
    }

    private void helper(ArrayList<Integer> list, List<List<Integer>> res, int first) {
        int n = list.size();
        if (first == n){
            res.add(new ArrayList<Integer>(list));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(list, first, i);
            helper(list, res, first + 1);
            Collections.swap(list, first, i);
        }
    }
}
