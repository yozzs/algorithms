package com.yozzs.algorithms.tree;

import java.util.*;

/**
 * @Author: liuys23
 * @Date: 2020/7/15
 * 层序遍历
 */
public class LevelOrder1 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.right = right;
        right.left = new TreeNode(10);
        right.right = new TreeNode(7);
        System.out.println(Arrays.toString(new LevelOrder1().levelOrder(root)));
    }

    public int[] levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) return new int[0];
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            list.add(temp.val);
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
