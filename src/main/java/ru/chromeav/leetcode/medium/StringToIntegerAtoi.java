package ru.chromeav.leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author a.khromov
 * @since 06.06.2023
 */
public class StringToIntegerAtoi {

    private final Set<Character> NUMBERS = Set.of('0','1','2','3','4','5','6','7','8','9');
    public int myAtoi(String s) {
        var val = 0;
        var out = new char[s.length()];
        var str = s.strip();
        if (str.length() == 0) {
            return val;
        }

        var isNegative = s.charAt(0) == '-';
        if (isNegative) {
            str = str.substring(1);
        }

        var index = 0;
        var len = str.length();
        char cursor;
        while (index < len) {
            cursor = str.charAt(index);
            if (!NUMBERS.contains(cursor)) {
                break;
            }
            out[index] = cursor;
            index++;
        }

        out = Arrays.copyOfRange(out, 0, index);
        try {//TODO an actual overflow check
            val = Integer.parseInt(String.valueOf(out));
            if (isNegative) {
                val = -val;
            }
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return val;
    }
}
