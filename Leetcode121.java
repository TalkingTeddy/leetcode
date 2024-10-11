class Solution {
    public int maxProfit(int[] prices) {

        int smallest = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < smallest)
                smallest = prices[i];

            if (prices[i] - smallest > maxProfit)
                maxProfit = prices[i] - smallest;
        }

        return maxProfit;
    }
}

/**
 * Leetcode121
 */
public class Leetcode121 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = { 7, 1, 7, 8, 1, 10 };
        System.out.println(solution.maxProfit(prices));
    }
}