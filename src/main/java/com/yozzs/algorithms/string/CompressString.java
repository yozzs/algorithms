package com.yozzs.algorithms.string;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: liuys23
 * @Date: 2020/9/18
 * 面试题 01.06. 字符串压缩
 * 示例1:
 *
 *  输入："aabcccccaaa"
 *  输出："a2b1c5a3"
 * 示例2:
 *
 *  输入："abbccd"
 *  输出："abbccd"
 *  解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
 */
public class CompressString {
    public String compressString(String s) {
        if (s == null || s.length() <= 1){
            return s;
        }
        StringBuilder res = new StringBuilder();
        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length){
            int j = i + 1;
            while (j < chars.length && chars[i] == chars[j]){
                j++;
            }
            res.append(chars[i]).append(j - i);
            i = j;
        }
        return res.toString().length() >= s.length() ? s : res.toString();
    }
}
