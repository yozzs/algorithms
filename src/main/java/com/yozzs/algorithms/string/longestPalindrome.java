package com.yozzs.algorithms.string;

/**
 * @Author: liuys23
 * @Date: 2020/10/15
 * 5. 最长回文子串
 */
public class longestPalindrome {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0){
            return null;
        }
        int len = 1;
        int maxLength = 0;
        int maxStart = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = i - 1;
            int r = i + 1;
            while (l >= 0 && s.charAt(i) == s.charAt(l)){
                l--;
                len++;
            }
            while (r < s.length() && s.charAt(i) == s.charAt(r)){
                r++;
                len++;
            }
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
                len += 2;
            }
            if (len > maxLength){
                maxLength = len;
                maxStart = l;
            }
            len = 1;
        }
        return s.substring(maxStart + 1, maxStart + maxLength + 1);
    }
}
