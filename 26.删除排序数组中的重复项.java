import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;
        for(int n:nums){
            if(cnt==0||nums[cnt-1]<n){
                nums[cnt]=n;
                cnt++;
            }
        }
        return cnt;
    }
public static void main(String[] args) {
    new Solution().removeDuplicates(new int[]{1,1,2});
}
}
