package com.jyx.algorithm.simple;

import com.jyx.algorithm.old.common.ListNode;

import java.util.HashMap;
import java.util.Map;

public class AndListNode {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode pA = headA,pB = headB;
        while (pA != pB){
            //如果不交，则会两个都=null退出循环
            pA= pA == null ? headB : pA.next;
            pB= pB == null ? headA : pB.next;
        }
        return pA;
    }



//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null){
//            return null;
//        }
//        Map<ListNode,Integer> map = new HashMap<>();
//        while (headA != null) {
//            map.put(headA, 1);
//            headA = headA.next;
//        }
//        while (headB != null){
//            if (map.containsKey(headB)){
//                return headB;
//            }
//            headB = headB.next;
//        }
//
//        return null;
//    }


}
