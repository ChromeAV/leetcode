package ru.chromeav.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author a.khromov
 * @since 05.06.2023
 */
class ReverseIntegerTest {
    private final ReverseInteger instance = new ReverseInteger();

    @Test
    public void example1() {
        assertEquals(321, instance.reverse(123));
    }

    @Test
    public void example2() {
        assertEquals(-321, instance.reverse(-123));
    }

    @Test
    public void example3() {
        assertEquals(21, instance.reverse(120));
    }

    @Test
    public void case4() {
        assertEquals(0, instance.reverse(2133333333));
    }

    @Test
    public void case5() {
        assertEquals(9, instance.reverse(900000));
    }

    @Test
    public void case6() {
        assertEquals(-2143847412, instance.reverse(-2147483412));
    }

    @Test
    public void case7() {
        assertEquals(0, instance.reverse(-2147483648));
    }

    @Test
    public void case8() {
        assertEquals(2147483641, instance.reverse(1463847412));
    }

    @Test
    public void case9() {
        assertEquals(0, instance.reverse(-1563847412));
    }
}