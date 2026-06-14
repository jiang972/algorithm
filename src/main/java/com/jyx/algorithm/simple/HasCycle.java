package com.jyx.algorithm.simple;

import com.jyx.algorithm.old.common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }
        ListNode fast = head.next , slow = head;
        while (fast != null && fast.next != null && slow != null){
            if (fast == slow){
                return true;
            }

            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }



//    public boolean hasCycle(ListNode head) {
//        if (head == null || head.next == null){
//            return false;
//        }
//        Set<ListNode> set = new HashSet<>();
//        ListNode temp = head;
//        while (temp.next != null){
//            if (set.contains(temp)){
//                return true;
//            }
//            set.add(temp);
//            temp = temp.next;
//        }
//
//        return false;
//    }


}
