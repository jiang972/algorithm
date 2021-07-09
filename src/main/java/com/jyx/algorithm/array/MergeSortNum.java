package com.jyx.algorithm.array;

public class MergeSortNum {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p0 = m+n-1;//1数组的最后那个位置，也是要插入的位置
        int p1 = m-1;//1数组的最后一个非0;也是未排序的数据
        int p2 = n-1;//2数组的最后一个未排序数据；
        while(p1 >= 0 || p2 >= 0){//p2还未完全插进p1就继续循环,p1如果小于0的话，就直接把屏的复制过去直到p2也负值
            if (p1 == -1){
                nums1[p0] = nums2[p2];
                p2--;
            }else if (p2 == -1){
                nums1[p0] = nums1[p1];
                p1--;
            }else if(nums1[p1] <= nums2[p2]){
                nums1[p0] = nums2[p2];
                p2--;
            }else {
                nums1[p0] = nums1[p1];
                p1--;
            }
            p0--;
        }
    }
}
