package com.yozzs.algorithms.tree;

import java.util.*;

/**
 * @Author: liuys23
 * @Date: 2020/7/15
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 */
public class LevelOrder2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.right = right;
        right.left = new TreeNode(10);
        right.right = new TreeNode(7);
        System.out.println(new LevelOrder2().levelOrder(root));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root != null) queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            // 因为queue.size()每次循环都有变化，所以倒序遍历
            for (int i = queue.size(); i > 0; i--) {
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            result.add(list);
        }
        return result;
    }

}
