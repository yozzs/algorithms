package com.yozzs.algorithms.string;

/**
 * @Author: liuys23
 * @Date: 2020/9/17
 * 28. 实现 strStr()
 * indexOf
 */
public class StrStr {
    public static void main(String[] args) {
        System.out.println(new StrStr().strStr("mississippi","pi"));
    }
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        int h = haystack.length();
        int n = needle.length();
        if (h == n) return haystack.equals(needle) ? 0 : -1;

        for (int i = 0; i <= h - n; i++) {
            int j = 0;
            while (j < n){
                if (haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
                j++;
            }
            if (j == n){
                return i;
            }
        }
        return -1;
    }
}
