package com.yozzs.algorithms.string;

/**
 * @Author: liuys23
 * @Date: 2020/9/18
 * 434. 字符串中的单词数
 */
public class CountSegments {
    public int countSegments(String s) {
        if (s == null || s.trim().length() == 0) return 0;
        return s.trim().split("\\s+").length;
    }
}
