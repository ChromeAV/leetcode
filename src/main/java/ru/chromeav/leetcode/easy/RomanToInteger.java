package ru.chromeav.leetcode.easy;

/**
 * @author a.khromov
 * @since 01.06.2023
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
        int currentValue;
        int currentNumber = 0;
        var chars = s.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            currentValue = toNumber(chars[i]);
            if (prevValue > currentValue) {
                currentNumber = prevValue - currentValue;
            } else {
                result += currentNumber;
                currentNumber = currentValue;
            }
            prevValue = currentValue;
        }
        result += currentNumber;

        return result;
    }

    private static int toNumber(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Illegal character: " + c);
        };
    }
}
