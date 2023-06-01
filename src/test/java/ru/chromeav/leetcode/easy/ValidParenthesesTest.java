package ru.chromeav.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author a.khromov
 * @since 01.06.2023
 */
class ValidParenthesesTest {
    private final ValidParentheses instance = new ValidParentheses();

    @Test
    public void example1() {
        assertTrue(instance.isValid("()"));
    }

    @Test
    public void example2() {
        assertTrue(instance.isValid("()[]{}"));
    }

    @Test
    public void example3() {
        assertFalse(instance.isValid("(]"));
    }

    @Test
    public void customCase1() {
        assertFalse(instance.isValid("{(]}"));
    }

    @Test
    public void customCase2() {
        assertTrue(instance.isValid("({})"));
    }

}