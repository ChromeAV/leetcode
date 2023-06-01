package ru.chromeav.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static ru.chromeav.leetcode.TestUtils.*;

/**
 * @author a.khromov
 * @since 01.06.2023
 */
class TwoSumTest {
    private final TwoSum instance = new TwoSum();
    @Test
    public void example1() {
        assertArrayEquals(instance.twoSum(arr(2,7,11,15), 9), arr(0, 1));
    }
    @Test
    public void example2() {
        assertArrayEquals(instance.twoSum(arr(3,2,4), 6), arr(1, 2));
    }
    @Test
    public void example3() {
        assertArrayEquals(instance.twoSum(arr(3,3), 6), arr(0, 1));
    }
}