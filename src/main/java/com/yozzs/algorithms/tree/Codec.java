package com.yozzs.algorithms.tree;

import java.util.*;

/**
 * @Author: liuys23
 * @Date: 2020/7/18
 * 37.二叉树序列化与反序列化
 */
public class Codec {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.right = right;
        right.left = new TreeNode(10);
        right.right = new TreeNode(7);
        Codec codec = new Codec();
        String result = codec.serialize(root);
        System.out.println(result);
        codec.deserialize(result);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return null;
        List<Integer> list = levelOrder(root);
        return Arrays.toString(list.toArray());
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() <= 0) return null;
        String s = data.substring(1, data.length() - 1);
        String[] nodes = s.split(",");
        int index = 0;
        TreeNode root = buildNode(nodes[index++]);
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.removeFirst();
            node.left = buildNode(nodes[index++]);
            node.right = buildNode(nodes[index++]);
            if (node.left != null){
                queue.addLast(node.left);
            }
            if (node.right != null){
                queue.addLast(node.right);
            }
        }
        return root;
    }

    private TreeNode buildNode(String node) {
        if (node == null) return null;
        node = node.trim();
        if ("null".equals(node)) return null;
        try {
            return new TreeNode(Integer.parseInt(node));
        }catch (NumberFormatException e){
            e.printStackTrace();
            return null;
        }
    }

    /*层序遍历*/
    private List<Integer> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            list.add(temp == null ? null : temp.val);
            if (temp != null) queue.add(temp.left);
            if (temp != null) queue.add(temp.right);
        }
        return list;
    }
}
