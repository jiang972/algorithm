package com.jyx.algorithm.array;

/**
 * https://leetcode-cn.com/problems/rotate-array/
 * 旋转数组
 */
public class Rotate {
    /**
     * 翻转三次即可得到结果
     * 因为k可能大于n，所以要对他取模，这种情况都要取模
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
