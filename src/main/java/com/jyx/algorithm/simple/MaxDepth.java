package com.jyx.algorithm.simple;

import com.jyx.algorithm.old.common.TreeNode;

public class MaxDepth {

    //     1
    //   2   3
    // 4  5  6  7
    //   7
    //1-2-4 4后左右节点是null，所以max(0,0) +1 = 1 ,2left的返回值node(4) = 1
    //接下里路由2right ，-》5left，存在7，然后7俩null所以node(7)=max(0,0) +1 = 1
    //5right是0，所以2right = node（5） = max（node（7） = 1 ， node（null） = 0） + 1 = 2
    //得出node（2） = max（node（4） =1 ， node（5） = 2） + 1 = 3
    //然后递归node（3）-》node（6），同理node（6） = 1 ，node（7） = 1
    //所以node（3） =2
    //然后node（1） = max（node（2） = 3 ， node（3） = 2） + 1 = 4
    //结论 = 4
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
