package com.jyx.algorithm.simple;

/**
 * @Description 移动0
 * @Classname MoveZeroes
 * @Author yuxin.jiang
 * @Date 2026/6/12 17:40
 * @Version V1.0
 */
public class MoveZeroes {


    public void moveZeroes(int[] nums) {
      if (nums.length < 1){
          return;
      }
      int curr = 0;
      for (int i = 0 ; i < nums.length; i++){
          if (nums[i]!=0){
              int num = nums[i];
              nums[i] = nums[curr];
              nums[curr] = num;
              curr++;
          }
      }
    }


}
