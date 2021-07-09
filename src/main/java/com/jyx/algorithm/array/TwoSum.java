package com.jyx.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/solution/
 * 有序数组的两数之和
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        //还是双指针
        int left=0,right=numbers.length-1;
        while(left < right){
            int result = numbers[left] + numbers[right];
            if (result == target){
                //为啥要+1呢？因为题目下标是从1开始算的
                return new int[]{left+1,right+1};
            }else if (result > target){
                right --;
            }else {
                left++;
            }
        }
        return new int[]{-1,-1};
    }


    /**
     * https://leetcode-cn.com/problems/two-sum/solution/
     * 无序数组的两数之和
     */
    public int[] twoSumNoSort(int[] nums, int target) {
        //可知key是实际数据，value是下标
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            //判断的条件是X+Y=target，这个判断就是看哈希是否已经存储了Y，如果能对应的话，肯定是能捕获的
            if (hashtable.containsKey(target - nums[i])) {
                //hashtable.get(target - nums[i])，其实拿到的就是X的下标
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            //把已经查询过的，也就是Y，放入哈希
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }


}
