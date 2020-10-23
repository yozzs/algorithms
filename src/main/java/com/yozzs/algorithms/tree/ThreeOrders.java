package com.yozzs.algorithms.tree;

import java.util.*;

/**
 * @Author: liuys23
 * @Date: 2020/10/16
 */
public class ThreeOrders {
    public static void main(String[] args) {
        BuildTree buildTree = new BuildTree();
        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};
        TreeNode root = buildTree.buildTree(pre, in);
        System.out.println(root);
        System.out.println(Arrays.deepToString(new ThreeOrders().threeOrders(root)));
    }

    public int[][] threeOrders (TreeNode root) {
        // write code here
        if(root == null) return null;
        return new int[][]{preOrder(root), inOrder(root), afterOrder(root)};
    }

    private int[] preOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        if (root == null) return null;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private int[] inOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private int[] afterOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        afterOrder(root, res);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private void afterOrder(TreeNode root, List<Integer> res){
        if(root == null) return;
        afterOrder(root.left, res);
        afterOrder(root.right, res);
        res.add(root.val);
    }
}
