package ru.chromeav.leetcode.easy;

/**
 * @author a.khromov
 * @since 01.06.2023
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            int numI = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (numI + nums[j] == target)
                    return new int[] {i, j};
            }
        }
        throw new IllegalStateException();
    }
}
