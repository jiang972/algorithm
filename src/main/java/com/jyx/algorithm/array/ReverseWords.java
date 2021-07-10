package com.jyx.algorithm.array;

/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * 反转字符串中的单词
 */
public class ReverseWords {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int left = 0,right = 0;
        while (left <= c.length-1){
            //这里错误比较多，忘了最后一个单词是没有空格结尾的，越界了
            //然后最后一个的单词的right没找对，前面有空格的那些都是空格的下标，而最后一个我却写的是单子最后一个字符的下标，就错了
            if (right == c.length || Character.isSpace(c[right])){
                swap(c,left,right-1);
                left = right+1;
                right ++;
            }else {
                right ++;
            }
        }
        //然后就是这里，不能直接toString
        return String.valueOf(c);
    }
    //end不能是空格，得是空格那面那个，start是空格后面的
    private void swap(char[] c,int start,int end){
        while(start < end){
            char c1 = c[start];
            c[start] = c[end];
            c[end] = c1;
            start++;
            end--;
        }
    }
}
