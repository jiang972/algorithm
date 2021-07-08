package com.jyx.algorithm.array;

/**
 * https://leetcode-cn.com/problems/maximum-subarray/solution/
 * 最大子序和
 */
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        //pre是滑动窗口的关键，max只是个记录返回的
        int pre = 0,max = nums[0];
        for (int num : nums){
            //判断当前这个x是不是大于之前所有的数加上x，rep必须不断地往上走，不然会卡在半路上
            pre = Math.max(pre+num,num);
            max = Math.max(pre,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }
}
