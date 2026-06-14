package com.jyx.algorithm.simple;

import com.jyx.algorithm.old.common.ListNode;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode temp = list1;
        ListNode temp2 = list2;
        ListNode newNode ;
        if (temp.val < temp2.val){
            newNode = new ListNode(temp.val);
            temp = temp.next;
        }else {
            newNode = new ListNode(temp2.val);
            temp2 = temp2.next;
        }
        ListNode tempNew = newNode;

        while (true){
            if (temp == null){
                tempNew.next = temp2;
                return newNode;
            }else if (temp2 == null){
                tempNew.next = temp;
                return newNode;
            }
            if (temp.val < temp2.val){
                tempNew.next = new ListNode(temp.val);
                temp = temp.next;
            }else {
                tempNew.next = new ListNode(temp2.val);
                temp2 = temp2.next;
            }
            tempNew = tempNew.next;
        }

    }

}
