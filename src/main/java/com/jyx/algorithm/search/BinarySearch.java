package com.jyx.algorithm.search;

/**
 * https://leetcode-cn.com/problems/binary-search/
 * 入门：二分查找
 */
public class BinarySearch {

    /**
     * 错误1.
     * 错误2.
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0)return -1;
        int i = 0;
        int j = len-1;
        //没有关注while条件，最开始是 i != j，可能出现数组元素1个，正好是目标的情况，就会bug
        while (i <= j){
            int mid = (i+j)/2;
            if (nums[mid] == target)return mid;
            //开始是i = mid，没有+1，-1之类的，mid都已经不等于了还等于mid干嘛
            if (nums[mid] < target)i = mid+1;
            if (nums[mid] > target)j = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] num = new int[-1,0,3,5,9,12];
    }
}
