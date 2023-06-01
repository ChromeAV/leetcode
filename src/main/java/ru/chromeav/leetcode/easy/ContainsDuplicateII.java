package ru.chromeav.leetcode.easy;

/**
 * @author a.khromov
 * @since 01.06.2023
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int lastIndex = nums.length - 1;
        for (int i = 0; i <= lastIndex; i++) {
            var numI = nums[i];
            var limit = Math.min(i + k, lastIndex);
            int j = i + 1;
            while (j <= limit)
            {
                if ((numI == nums[j])) {
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}
