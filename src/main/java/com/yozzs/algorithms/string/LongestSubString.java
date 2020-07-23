package com.yozzs.algorithms.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: liuys23
 * @Date: 2020/7/21
 * 48.最长不含重复字符的子字符串的长度
 * 滑动窗口
 */
public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(new LongestSubString().lengthOfLongestSubstring("dfasgosaimvaosainwlvv"));
    }
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        String result = "";
        Set<Character> set = new HashSet<>();
        for(int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            while(set.contains(c)) {
                set.remove(s.charAt(l++));
            }
            set.add(c);
            res = Math.max(res, r - l + 1);
            String substring = s.substring(l, r + 1);
            result = substring.length() > result.length() ? substring : result;
        }
        System.out.println(result);
        return res;
    }
}
