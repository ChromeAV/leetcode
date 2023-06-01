package ru.chromeav.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

import static ru.chromeav.leetcode.TestUtils.*;

/**
 * @author a.khromov
 * @since 01.06.2023
 */
class ContainsDuplicateIITest {
    private final ContainsDuplicateII instance = new ContainsDuplicateII();

    @Test
    public void example1() {
        assertTrue(instance.containsNearbyDuplicate(arr(1,2,3,1), 3));
    }

    @Test
    public void example2() {
        assertTrue(instance.containsNearbyDuplicate(arr(1,0,1,1), 1));
    }

    @Test
    public void example3() {
        assertFalse(instance.containsNearbyDuplicate(arr(1,2,3,1,2,3), 2));
    }

    @Test
    public void case4() {
        var min = -24500;
        var max = 29999;
        var atomic = new AtomicInteger(min);
        int limit = max + min;
        int[] arr = new int[limit];
        for (int count = 0; count < limit; count++) {
            int integer = atomic.incrementAndGet();
            arr[count] = integer;
        }
        assertFalse(instance.containsNearbyDuplicate(arr, 3500));
    }

    @Test
    public void case6() {
        assertTrue(instance.containsNearbyDuplicate(arr(99, 99), 2));
    }

    @Test
    public void case7() {
        assertTrue(instance.containsNearbyDuplicate(arr(2, 2), 3));
    }

    @Test
    public void case8() {
        assertTrue(instance.containsNearbyDuplicate(arr(1,2,3,4,5,6,7,8,9,9), 3));
    }
}