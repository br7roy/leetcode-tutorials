/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现strStr()
 */
class Solution {
    public int strStr(String haystack, String needle) {
        int ret = haystack.indexOf(needle);
        return ret;
    }

    public static void main(String[] args) {
        new Solution().strStr("hello", "ll");
    }
}
