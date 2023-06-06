package ru.chromeav.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static ru.chromeav.leetcode.TestUtils.*;

/**
 * @author a.khromov
 * @since 06.06.2023
 */
class BestTimeToBuyAndSellStockTest {
    private final BestTimeToBuyAndSellStock instance = new BestTimeToBuyAndSellStock();

    @Test
    public void example1() {
        assertEquals(5, instance.maxProfit(arr(7,1,5,3,6,4)));
    }

    @Test
    public void example2() {
        assertEquals(0, instance.maxProfit(arr(7,6,4,3,1)));
    }

}