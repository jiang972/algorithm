package com.jyx.algorithm.search;

/**
 * https://leetcode-cn.com/problems/first-bad-version/
 * 查询第一个有错误的版本
 */
public class FindOneErrorVersion {

    public static int firstBadVersion(int n) {
        int i= 0,j = n;
        while (i <= j){
            int mid = i+ (j-i)/2;//全新的写法，二分查找的二分有点bug，这样写最稳妥
            Boolean badVersion = isBadVersion(mid);

            if (badVersion && (mid ==0 || !isBadVersion(mid-1))) return mid;
            if (badVersion) j = mid-1;
            if (!badVersion) i = mid+1;
        }
        return -1;
    }

//    还有一种写法是只让j用二分变小，而i是一步一步的增加，我觉得没啥必要，一步一步来太慢了
//    public int firstBadVersion(int n) {
//        int lo = 1;
//        int hi = n;
//        while(lo < hi) {
//            int mid = lo + (hi - lo) / 2;
//            if (isBadVersion(mid)) {
//                hi = mid;
//            } else {
//                lo = mid + 1;
//            }
//        }
//        return hi;
//    }

    //true的话就证明版本是错的
    public static Boolean isBadVersion(int n){
        Boolean[] bool = {false,false,false,false,true,true,true};
        return bool[n];
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(7));
    }
}
