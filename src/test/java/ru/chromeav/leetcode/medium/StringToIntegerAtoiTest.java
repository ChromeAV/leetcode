package ru.chromeav.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author a.khromov
 * @since 06.06.2023
 */
class StringToIntegerAtoiTest {
    private final StringToIntegerAtoi instance = new StringToIntegerAtoi();

    @Test
    public void example1() {
        assertEquals(42, instance.myAtoi("42"));
    }

    @Test
    public void example2() {
        assertEquals(-42, instance.myAtoi("-42"));
    }

    @Test
    public void example3() {
        assertEquals(4193, instance.myAtoi("4193 with words"));
    }
}