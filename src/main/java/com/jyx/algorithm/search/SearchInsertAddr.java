package com.jyx.algorithm.search;

/**
 * https://leetcode-cn.com/problems/search-insert-position/submissions/
 * 查询应该插入的地址
 */
public class SearchInsertAddr {
    /**
     * [1,3,5,6]
     * 2
     */
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0)return 0;
        int i = 0,j=nums.length-1;
        while(i <= j){
            int mid = i + (j-i)/2;
            //这块做了修改，就算等于也让他往下走，主要还是便于学习算法吧，直接判断等于最稳妥
            if (target <= nums[mid])j = mid-1;
            if (target > nums[mid])i = mid+1;
        }
        return i;
    }

}
