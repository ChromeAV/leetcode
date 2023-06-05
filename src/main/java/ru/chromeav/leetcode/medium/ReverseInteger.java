package ru.chromeav.leetcode.medium;

/**
 * @author a.khromov
 * @since 05.06.2023
 */
public class ReverseInteger {
    //-2147483648 to 2147483647
    private static final int[] MAX_VAL = {2,1,4,7,4,8,3,6,4,8};
    public int reverse(int x) {
        var isPositive = x >= 0;
        if (!isPositive && x == Integer.MIN_VALUE)
            return 0;

        var abs = Math.absExact(x);
        var chars = String.valueOf(abs).toCharArray();
        int len = chars.length;
        var ret = new char[len];
        var couldOverflow = len >= 10;

        for (int i = len - 1; i >= 0; i--) {
            var val = chars[i];
            var index = len - 1 - i;

            if (couldOverflow) {
                int num = Integer.parseUnsignedInt(String.valueOf(val));
                int max = MAX_VAL[index];
                if (max < num) {
                    return 0;
                } else if (max > num) {
                    couldOverflow = false;
                }
            }
            ret[index] = val;
        }

        int result = Integer.parseInt(String.valueOf(ret));
        return isPositive ? result : -result;
    }
}
