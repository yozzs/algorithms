package com.yozzs.algorithms.string;


/**
 * @Author: liuys23
 * @Date: 2020/7/8
 * 将字符串中的空格替换成%20
 * tips：从后往前复制
 */
public class ReplaceBlank {
    public static void main(String[] args) {
        String str = " All is well ";
        replaceBlank(str);
    }
    private static String replaceBlank(String s){
        char[] str = s.toCharArray();
        int length = str.length;
        if (length < 1){
            return null;
        }
        int oldLength = 0;
        int blankNum = 0;
        for (int i = 0; i <= length - 1; i++) {
            oldLength++;
            if (str[i] == ' '){
                blankNum++;
            }
        }
        int newLength = oldLength + blankNum * 2;
        char[] newStr = new char[newLength];
        for (int j = 0; j <= oldLength - 1; j++) {
            newStr[j] = str[j];
        }
        int oldIndex = oldLength - 1;
        int newIndex = newLength - 1;
        while(oldIndex >= 0 && newIndex > oldIndex){
            if (newStr[oldIndex] == ' '){
                newStr[newIndex--] = '0';
                newStr[newIndex--] = '2';
                newStr[newIndex--] = '%';
            }else {
                newStr[newIndex--] = newStr[oldIndex];
            }
            --oldIndex;
        }
        return new String(newStr);
    }
}
