package com.yozzs.algorithms.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liuys23
 * @Date: 2020/9/17
 * 14. 最长公共前缀
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"a"}));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        int j = 0;
        while (true){
            if (strs.length == 1) return strs[0];
            for (int i = 0; i < strs.length - 1 ; i++) {
                if (j >= strs[i].length() || j >= strs[i + 1].length()
                        || strs[i].charAt(j) != strs[i + 1].charAt(j)){
                    return strs[i].substring(0, j);
                }
            }
            j++;
        }
    }
}
