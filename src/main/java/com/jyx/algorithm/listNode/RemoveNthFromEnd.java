package com.jyx.algorithm.listNode;

import com.jyx.algorithm.common.ListNode;

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * 删除链表的倒数第 N 个结点
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //快慢指针，快指针先走n步，慢指针再跟着一起走,需要一个虚拟节点，因为可能就一个节点然后就把这个节点删除
        ListNode dummy = new ListNode(0,head);//指向head节点
        ListNode slow = dummy;
        ListNode fast = head;
        for (int i = 1;i < n && fast!= null; i++){
            fast = fast.next;
        }
        //如果fast为null了，那正常情况下就是要比slow差了n+1步。slow才会是正确的节点，因为fast超过限制了
        //所以上面i，如果初始设置为0，i<n的话，那么一直fast都会比slow差了n+1步，所以只需要判断fast是否为null就行了
        //那如果i初始值为1，那fast都会比slow差了n步，就必须判断fast.next != null
        while (fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
