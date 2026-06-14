package com.jyx.algorithm.simple;

import com.jyx.algorithm.old.common.ListNode;

import java.util.List;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return null;
        }
        //head -> temp -> next
        //head <- temp  next
        //temp next -> nextS
        ListNode first = head;
        ListNode temp = head.next;
        ListNode next = temp.next;
        head.next = null;
        while (true){
            if (next == null){
                temp.next = first;
                return temp;
            }
            temp.next = first;
            first = temp;
            temp = next;
            next = next.next;
        }
    }


}
