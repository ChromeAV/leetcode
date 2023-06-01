package ru.chromeav.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author a.khromov
 * @since 01.06.2023
 */
class RomanToIntegerTest {
    private final RomanToInteger instance = new RomanToInteger();

    @Test
    void example1() {
        assertEquals(3, instance.romanToInt("III"));
    }

    @Test
    void example2() {
        assertEquals(58, instance.romanToInt("LVIII"));
    }

    @Test
    void example3() {
        assertEquals(1994, instance.romanToInt("MCMXCIV"));
    }
}