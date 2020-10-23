package com.yozzs.algorithms.array;


/**
 * @Author: liuys23
 * @Date: 2020/10/22
 * 567. 字符串的排列
 */
public class CheckInclusion {
    public static void main(String[] args) {
        System.out.println(new CheckInclusion().checkInclusion("ab", "eidboaoo"));
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() > s2.length()) return false;
        int[] map1 = new int[26];
        int i = 0;
        while(i < s1.length()){
            map1[s1.charAt(i) - 'a']++;
            i++;
        }
        for(int j = 0; j <= s2.length() - s1.length(); j++){
            int[] map2 = new int[26];
            for(int k = j; k < j + s1.length(); k++){
                map2[s2.charAt(k) - 'a']++;
            }
            if(match(map1, map2)){
                return true;
            }
        }
        return false;
    }

    private boolean match(int[] map1, int[] map2){
        for(int m = 0; m < 26; m++){
            if(map1[m] != map2[m]){
                return false;
            }
        }
        return true;
    }
}
