package ru.chromeav.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author a.khromov
 * @since 01.06.2023
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        //return Arrays.stream(nums).distinct().toArray().length != nums.length;
        var values = new HashSet<>(nums.length);
        for (int num : nums) {
            if (values.contains(num)) {
                return true;
            }
            values.add(num);
        }
        return false;
    }
}
