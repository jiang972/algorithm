package com.jyx.algorithm.listNode;

import com.jyx.algorithm.common.ListNode;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * 链表的中间结点
 */
public class MiddleNode {
    //快慢指针
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
