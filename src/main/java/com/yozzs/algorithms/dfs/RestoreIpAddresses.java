package com.yozzs.algorithms.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liuys23
 * @Date: 2020/10/18
 * 93. 复原IP地址
 */
public class RestoreIpAddresses {
    List<String> res = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(new RestoreIpAddresses().restoreIpAddresses("123123"));
    }

    public List<String> restoreIpAddresses(String s) {
        if (s == null || s.length() > 12) return res;
        List<String> tempList = new ArrayList<>();
        dfs(s, tempList, 0);
        return res;
    }
    private void dfs(String s, List<String> tempList, int idx){
        if (tempList.size() == 4 && idx == s.length()){
            res.add(String.join(".", tempList));
        }
        if (tempList.size() > 4 || idx >= s.length()) return;

        if (s.charAt(idx) == '0') {
            tempList.add(s.substring(idx, idx + 1));
            dfs(s, tempList, idx + 1);
            tempList.remove(tempList.size() - 1);
        } else {
            for (int i = idx; i < s.length(); i++) {
                if (Integer.parseInt(s.substring(idx, i + 1)) > 0xff) {
                    break;
                }
                tempList.add(s.substring(idx, i + 1));
                dfs(s, tempList, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
