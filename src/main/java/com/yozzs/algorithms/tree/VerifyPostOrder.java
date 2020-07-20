package com.yozzs.algorithms.tree;

import java.util.Arrays;

/**
 * @Author: liuys23
 * @Date: 2020/7/16
 * 求给定数组是不是某一个二叉搜索树的后序遍历
 */
public class VerifyPostOrder {
    public static void main(String[] args) {
        int[] arr = {4,8,6,12,16,14,10};
        int[] arr1 = {1,2,5,10,6,9,4,3};
        System.out.println(new VerifyPostOrder().verifyPostorder(arr1));
    }
    public boolean verifyPostorder(int[] postorder) {
        int length = postorder.length;
        if (length <= 0) return true;
        int root = postorder[length - 1];
        // 找到左右子树分界点
        int i = 0;
        while (i < length - 1){
            if(postorder[i] > root) break;
            i++;
        }
        //判断右子树是否都大于root
        int j = i;
        while (j < length - 1){
            if (postorder[j] <= root){
                return false;
            }
            j++;
        }
        //判断左右子树是否为后序遍历序列
        boolean left = true;
        int[] leftArr = Arrays.copyOfRange(postorder, 0, i);
        int[] rightArr = Arrays.copyOfRange(postorder, i, length - 1);

        if (i > 0){
            left = verifyPostorder(leftArr);
        }
        boolean right = true;
        if (i < length - 1){
            right = verifyPostorder(rightArr);
        }
        return left & right;
    }

}
