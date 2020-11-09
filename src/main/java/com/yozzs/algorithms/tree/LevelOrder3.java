package com.yozzs.algorithms.tree;

import java.util.*;

/**
 * @Author: liuys23
 * @Date: 2020/7/15
 * 返回二叉树的左视图 （每层的第一个节点）
 */
public class LevelOrder3 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.right = right;
        right.left = new TreeNode(10);
        right.right = new TreeNode(7);
        System.out.println(Arrays.toString(new LevelOrder3().levelOrder(root)));
    }

    public int[] levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) return new int[0];
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (i == 0){
                    list.add(temp.val);
                }
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
