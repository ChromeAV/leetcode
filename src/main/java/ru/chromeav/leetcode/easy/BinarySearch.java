package ru.chromeav.leetcode.easy;

import java.util.Arrays;

/**
 * @author a.khromov
 * @since 01.06.2023
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        return Math.max(Arrays.binarySearch(nums, target) , -1);
//        return binarySearch(nums, target);
    }

    private static int binarySearch(int[] nums, int target) {
        var lastIndex = nums.length - 1;
        if (nums[lastIndex] < target) {
            return -1;
        }

        for (int i = 0; i <= lastIndex; i++) {
            var numI = nums[i];
            if (numI == target) {
                return i;
            }
            if (numI > target) {
                return -1;
            }
        }
        return -1;
    }
}
