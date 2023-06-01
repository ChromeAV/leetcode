package ru.chromeav.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author a.khromov
 * @since 01.06.2023
 */
class ContainsDuplicateTest {
    private final ContainsDuplicate instance = new ContainsDuplicate();

    private int[] arr(int... values) {
        return values;
    }

    @Test
    public void example1() {
        assertTrue(instance.containsDuplicate(arr(1,2,3,1)));
    }

    @Test
    public void example2() {
        assertFalse(instance.containsDuplicate(arr(1,2,3,4)));
    }

    @Test
    public void example3() {
        assertTrue(instance.containsDuplicate(arr(1,1,1,3,3,4,3,2,4,2)));
    }
}