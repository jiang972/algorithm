package com.jyx.algorithm.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/contains-duplicate/
 * 存在重复元素
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i< nums.length;i++){
            if (!set.add(nums[i]))return true;
        }
        return false;
    }
}
