package com.yozzs.algorithms.string;

/**
 * @Author: liuys23
 * @Date: 2020/8/4
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 */
public class ReverseWords {
    public String reverseWords(String s) {
        if (s == null) return null;
        String[] parts = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            sb.append(parts[i]);
            sb.append(" ");
        }
        String res = sb.toString();
        return res.substring(0, res.length() - 1);
    }
}
