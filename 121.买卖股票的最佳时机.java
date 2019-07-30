/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;

        }
        int ret = 0;
        int bought = prices[0];
        for (int j = 1; j < prices.length; j++) {
            if (prices[j] > bought) {
                int dif = prices[j] - bought;
                if (dif > 0) {
                    if (dif > ret) {
                        ret = dif;
                    }
                }
            } else {
                bought = prices[j];
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int ret = s.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });
        System.out.println(ret);

    }
}
