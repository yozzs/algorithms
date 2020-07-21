package com.yozzs.algorithms.string;

/**
 * @Author: liuys23
 * @Date: 2020/7/21
 * 50. 第一个只出现一次的字符
 */
public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println(new FirstUniqueChar().firstUniqChar("abaccdeff"));
    }
    public char firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == i && s.indexOf(ch, i + 1) == -1)
                return s.charAt(i);
        }
        return ' ';
    }
}
