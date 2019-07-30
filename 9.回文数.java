/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */
class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            for (int j = cs.length - 1; j >= 0; j--) {
                if (cs[i] != cs[j]) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        boolean a = s.isPalindrome(121);
        System.out.println(a);
        
    }
}
