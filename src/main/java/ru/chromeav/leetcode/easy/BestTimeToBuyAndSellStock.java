package ru.chromeav.leetcode.easy;

/**
 * @author a.khromov
 * @since 06.06.2023
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        var lowestPrice = Integer.MAX_VALUE;
        var bestValue = 0;
        var todayValue = 0;
        for (int price : prices) {
            lowestPrice = Math.min(lowestPrice, price);
            todayValue = price - lowestPrice;
            bestValue = Math.max(todayValue, bestValue);
        }
        return bestValue;
    }
}
