package com.yozzs.algorithms.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: liuys23
 * @Date: 2020/9/18
 * 859. 亲密字符串
 */
public class BubbyStrings {
    public static void main(String[] args) {
        System.out.println(new BubbyStrings().buddyStrings("ab","ba"));
    }

    public boolean buddyStrings(String a, String b) {
        if (a == null || b == null || a.length() != b.length()){
            return false;
        }
        int m = -1;
        int n = -1;
        boolean hasSame = false;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            if (set.contains(a.charAt(i))){
                hasSame = true;
            }else if (!hasSame){
                set.add(a.charAt(i));
            }
            if (a.charAt(i) != b.charAt(i)){
                if (m == -1){
                    m = i;
                }else if (n == -1){
                    n = i;
                }else { // 最多两个不相同的字符
                    return false;
                }
            }
        }
        if (m == n){
            return hasSame;
        }
        return n >= 0 && a.charAt(m) == b.charAt(n) && a.charAt(n) == b.charAt(m);
    }
}
