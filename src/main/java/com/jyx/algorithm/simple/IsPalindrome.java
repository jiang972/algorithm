package com.jyx.algorithm.simple;

import com.jyx.algorithm.old.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        int size = list.size();
        int i = 0 ,j= size-1;
        for (; i < j; i++,j--){
            if (!Objects.equals(list.get(i), list.get(j))){
                return false;
            }
        }
        return true;
    }
}
