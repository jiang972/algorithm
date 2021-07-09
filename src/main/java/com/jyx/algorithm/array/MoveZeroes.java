package com.jyx.algorithm.array;

/**
 * https://leetcode-cn.com/problems/move-zeroes/
 * 移动 0
 */
public class MoveZeroes {
    /**
    public void moveZeroes(int[] nums) {
        //我觉得应该是双指针
        //这里是是唯一的错误，因为如果i到了最后一个，j就是越界了。
        //其实i到倒数第二个就行，倒数第一个完全没有判断空间啊
        for (int i = 0;i<nums.length-1;i++){
            int left = nums[i];
            if (left == 0){
                int j = i+1;
                while(true){
                    int right = nums[j];
                    if (right != 0){
                        int z = nums[i];
                        nums[i] = nums[j];
                        nums[j] = z;
                        break;
                    }
                    if (++j == nums.length)return;
                }
            }
        }
    }*/
    //新版本,把0堆在左指针那里，右边不断把非0和左边的0交换
    public void moveZeroes(int[] nums) {
        int left = 0,right=0;
        while (right < nums.length){
            if (nums[right] != 0){
                int z = nums[right];
                nums[right] = nums[left];
                nums[left] = z;
                left++;
            }
            right++;
        }
    }


}
