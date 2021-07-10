package com.jyx.algorithm.array;

/**
 * https://leetcode-cn.com/problems/reverse-string/solution/
 * 反转字符串
 */
public class ReverseString {
    public void reverseString(char[] s) {
        for (int left=0,right=s.length-1; left < right ; left++,right--){
            char z = s[left];
            s[left] = s[right];
            s[right] = z;
        }
    }
}
