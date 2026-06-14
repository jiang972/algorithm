package com.jyx.algorithm.simple;

import com.jyx.algorithm.old.common.TreeNode;

public class InvertTree {
    //其实只需要交换一下每一个节点的左右节点即可
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        //后序遍历最后返回的就是根节点
        return root;
    }


}
