package com.yozzs.algorithms.tree;

/**
 * @Author: liuys23
 * @Date: 2020/7/9
 * 已知前序遍历序列和中序遍历序列，求二叉树
 * tips: 递归
 */
public class BuildTree {
    public static void main(String[] args) {
        BuildTree buildTree = new BuildTree();
        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};
        System.out.println(buildTree.buildTree(pre, in));
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        if(length < 1) return null;
        int root = preorder[0];
        TreeNode rootNode = new TreeNode(root);
        // 获取左子树节点数
        int i = 0;
        while (inorder[i] != root){
            i++;
        }
        int leftLength = i;
        // 获取左子树中序遍历
        int[] leftIn = new int[leftLength];
        int j = 0;
        while (inorder[j] != root){
            leftIn[j] = inorder[j];
            j++;
        }
        // 获取左子树前序遍历
        int[] leftPre = new int[leftLength];
        for (int k = 1; k < leftLength + 1; k++) {
            leftPre[k-1] = preorder[k] ;
        }
        rootNode.left = buildTree(leftPre,leftIn);

        // 获取右子树节点数
        int m = length - 1;
        while(inorder[m] != root){
            m--;
        }
        int rightLength = length - (m + 1);
        // 获取右子树中序遍历
        int[] rightIn = new int[rightLength];
        for (int k = rightLength - 1; k >= 0; k--) {
            rightIn[k] = inorder[k + (length - rightLength)];
        }
        // 获取右子树前序遍历
        int[] rightPre = new int[rightLength];
        for (int k = rightLength - 1; k >=0 ; k--) {
            rightPre[k] = preorder[k + (length - rightLength)];
        }
        rootNode.right = buildTree(rightPre,rightIn);
        return rootNode;
    }


}
