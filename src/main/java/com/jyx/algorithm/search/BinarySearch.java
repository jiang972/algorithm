package com.jyx.algorithm.search;

/**
 * https://leetcode-cn.com/problems/binary-search/
 * 入门：二分查找
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0)return -1;
        int i = 0;
        int j = len-1;
        while (i != j){
            int mid = (i+j)/2;
            if (nums[mid] == target)return mid;
            if (nums[mid] < target)i = mid;
            if (nums[mid] > target)j = mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] num = new int[-1,0,3,5,9,12];
    }
}
