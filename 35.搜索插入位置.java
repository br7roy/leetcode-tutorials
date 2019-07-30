/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i]) == target) {
                return i;
            }
        }

        if (nums.length == 1) {
            for (int i = 0; true; i++) {
                if (nums[i] < target) {
                    return 1;
                } else {
                    return 0;
                }
            }
        } else if (nums.length == 2) {
            if (target < nums[0]) {
                return 0;
            } else if (target < nums[1]) {
                return 1;
            } else
                return 2;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                int pre = nums[i];
                int after = nums[i + 1];
                if (pre < target && target < after) {
                    return i + 1;
                }
            }
        }
        if (target < nums[0]) {
            return 0;
        } else {
            return nums.length;
        }
    }
}

