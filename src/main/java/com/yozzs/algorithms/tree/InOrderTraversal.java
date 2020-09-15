package com.yozzs.algorithms.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: liuys23
 * @Date: 2020/9/14
 * 94. 二叉树的中序遍历
 */
public class InOrderTraversal {
    List<Integer> res = new ArrayList<>();
    //递归
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return res;
        if (root.left != null){
            inorderTraversal(root.left);
        }
        res.add(root.val);
        if (root.right != null){
            inorderTraversal(root.right);
        }
        return res;
    }

    //迭代
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }


}
