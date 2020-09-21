package com.yozzs.algorithms.string;

/**
 * @Author: liuys23
 * @Date: 2020/9/18
 * 917. 仅仅反转字母
 * 输入："Test1ng-Leet=code-Q!"
 * 输出："Qedo1ct-eeLg=ntse-T!"
 */
public class ReserveOnlyLetters {
    public static void main(String[] args) {
        System.out.println(new ReserveOnlyLetters().reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
    public String reverseOnlyLetters(String s) {
        if (s == null) return null;
        char[] chars = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;
        while (l < r){
            while (l < r && !isLetter(chars[l])){l++;}
            while (l < r && !isLetter(chars[r])){r--;}
            if (l < r){
                swap(chars, l++, r--);
            }
        }
        return new String(chars);
    }

    private void swap(char[] chars, int l, int r) {
        char temp = chars[l];
        chars[l] = chars[r];
        chars[r] = temp;
    }

    private boolean isLetter(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}
