package com.jyx.algorithm.array;

/**
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/submissions/
 * 有序数组的平方
 */
public class SortNumSquare {
    /**
     * 双指针法
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int i = 0,j = n-1,resultPos = n-1;
        while (i <= j){
            int leftSequare = nums[i]*nums[i];
            int rightSequare = nums[j]*nums[j];
            if (leftSequare <= rightSequare){
                result[resultPos] = rightSequare;
                j--;
            }else {
                result[resultPos] = leftSequare;
                i++;
            }
            resultPos--;
        }
        return result;
    }
}
