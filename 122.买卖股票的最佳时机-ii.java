/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0 ;
        int nextIndex = 1;
        int bought = prices[0];
        int total = 0;
        boolean need = false;
        for (int i = 1; i < prices.length; i++) {
            if (need) {
                bought = prices[i];
                need=false;
                continue;
            }
            if (prices[i] > bought) {
                total += (prices[i] - bought);
                nextIndex = i + 1;
                need = true;
            } else {
                bought = prices[i];
                need=false;
            }

        }
        return total;
    }
}
