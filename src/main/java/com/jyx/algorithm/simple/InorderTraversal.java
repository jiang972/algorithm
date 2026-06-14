package com.jyx.algorithm.simple;

import com.jyx.algorithm.old.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null){
            return res;
        }
        inOrder(root);
        return res;
    }

    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        res.add(root.val);
        inOrder(root.right);
    }

}
