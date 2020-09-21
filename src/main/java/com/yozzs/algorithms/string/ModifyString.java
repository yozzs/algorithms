package com.yozzs.algorithms.string;

/**
 * @Author: liuys23
 * @Date: 2020/9/18
 * 1576. 替换所有的问号
 */
public class ModifyString {
    private static final char[] POOL = new char[]{'a','b','c'};
    private static final char BLANK = ' ';
    public String modifyString(String s) {
        if (s == null || s.isEmpty()) return s;
        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if ('?' == chars[i]){
                char pre = BLANK;
                char after = BLANK;
                if (chars.length == 1){

                }else if (i == 0){
                    after = chars[i + 1];
                }else if (i == chars.length - 1){
                    pre = chars[i - 1];
                }else {
                    pre = chars[i - 1];
                    after = chars[i + 1];
                }
                chars[i] = select(pre, after);
            }
        }
        return new String(chars);
    }

    private char select(char pre, char after){
        for (int i = 0; i < POOL.length; i++) {
            if (pre != POOL[i] && after != POOL[i]){
                return POOL[i];
            }
        }
        return ' ';
    }

}
