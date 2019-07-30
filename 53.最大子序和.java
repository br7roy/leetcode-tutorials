import java.util.stream.Stream;

/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int ret = 0;
        int temp = 0;
        boolean flg = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j >=i; j--) {
                int[] dest = null;
                try {
                    dest=new int[j - i + 1];
                    System.arraycopy(nums, i, dest, 0, j-i+1);
                } catch (Exception e) {
                    System.out.println(i+":"+j);
                }
        
                // if (dest.length == nums.length) {
                //     continue;
                // }
                for (int a : dest) {
                    temp += a;
                }
                if (!flg){
                    ret=temp;
                    flg = true;
                }
                if (temp > ret) {
                    ret = temp;
                }
                temp = 0;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        // int[] arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // int[] arr = new int[] { -1, -2 };
        int[] arr = new int[] {  -2 ,1};
        System.out.println(s.maxSubArray(arr));

    }
}
