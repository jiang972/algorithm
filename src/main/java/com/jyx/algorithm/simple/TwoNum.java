package com.jyx.algorithm.simple;

import java.util.Arrays;

/**
 * @Description 两数之和
 * @Classname TwoNum
 * @Author yuxin.jiang
 * @Date 2026/6/12 16:38
 * @Version V1.0
 */
public class TwoNum {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        if (length <1 ){
            return new int[]{};
        }
        for (int i = 0; i <= length-1; i++){
            for (int j = i+1;j <= length-1;j++){
                if ( nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

}
