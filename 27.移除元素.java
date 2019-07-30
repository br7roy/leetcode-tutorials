/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt = 0 ;
        for(int n : nums){
            if(n!=val){
                nums[cnt++]=n;
            }
        }
        return cnt;
    }
}

