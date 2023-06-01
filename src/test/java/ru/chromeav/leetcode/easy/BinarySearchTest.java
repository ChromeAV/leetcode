package ru.chromeav.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static ru.chromeav.leetcode.TestUtils.*;

/**
 * @author a.khromov
 * @since 01.06.2023
 */
class BinarySearchTest {
    private final BinarySearch instance = new BinarySearch();

    @Test
    public void example1() {
        assertEquals(4, instance.search(arr(-1,0,3,5,9,12), 9));
    }

    @Test
    public void example2() {
        assertEquals(-1, instance.search(arr(-1,0,3,5,9,12), 2));
    }

}