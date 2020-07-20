package com.yozzs.algorithms.string;


import java.util.*;

/**
 * @Author: liuys23
 * @Date: 2020/7/18
 * 38.输入一个字符串，输出字符串的所有排列
 * dfs，回溯
 */
public class Permutation {
    List<String> result;
    char[] chars;

    public static void main(String[] args) {
        java.lang.String s = "bcc";
        System.out.println(Arrays.toString(new Permutation().permutation(s)));
    }

    public String[] permutation(String s) {
        if (s == null || s.length() <= 0) return new String[0];
        result = new ArrayList<>();
        chars = s.toCharArray();
        permutation(0);
        return result.toArray(new String[]{});
    }

    private void permutation(int index) {
        if (chars.length <= 0) return;
        if (index == chars.length - 1){
            result.add(new String(chars));
        }
        Set<Character> strCache = new HashSet<>();
        for (int i = index; i < chars.length; i++) {
            //剪枝，同一位置同一字符只固定一次
            if (strCache.contains(chars[i])){
                continue;
            }
            strCache.add(chars[i]);
            swap(chars, i, index);
            permutation(index + 1);
            //回溯
            swap(chars, i, index);
        }
    }

    private void swap(char[] chars, int a, int b){
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    };
}
