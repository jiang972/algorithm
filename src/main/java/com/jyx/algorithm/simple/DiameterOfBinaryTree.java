package com.jyx.algorithm.simple;

import com.jyx.algorithm.old.common.TreeNode;

public class DiameterOfBinaryTree {

    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }
       diameter( root);
       return res;
    }
    //新建一个方法是为了根方法返回res
    //这个方法就是不断的求每个节点的左右最高，维护res的值
    public int diameter(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        //如果没有这行，就是求树的最大深度了
        //这行就是不断记录所有节点的，左右节点最大深度之和
        //要有抽象思维，不要陷入细节，对于树来说
        //对于当前node， left和right的长度到这块的时候都已经拿到了，直接维护就好
        res = Math.max(res, left + right);
        return Math.max(left, right) + 1;
    }

}
