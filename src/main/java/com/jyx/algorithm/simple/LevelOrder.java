package com.jyx.algorithm.simple;

import com.jyx.algorithm.old.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    //bfs遍历，层级遍历
    //使用queue，保存每一层的所有元素，遍历的时候，将下一层的所有元素保存在queue中
    // 弹出之前层级的所有元素，就是层级了
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);//把根元素放进来，就可以开始了
        while (!queue.isEmpty()){
            //这一层循环，处理的是每一层，每一层的多个节点由后续while处理
            List<Integer> now = new ArrayList<>();
            Queue<TreeNode> temp = new ArrayDeque<>();
            while (!queue.isEmpty()){
                TreeNode poll =queue.poll();
                if (poll.left != null){
                    temp.add(poll.left);
                }
                if (poll.right != null){
                    temp.add(poll.right);
                }
                now.add(poll.val);
            }
            res.add(now);
            queue = temp;
        }
        return res;
    }
}
