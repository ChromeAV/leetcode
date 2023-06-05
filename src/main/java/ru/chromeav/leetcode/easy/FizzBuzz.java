package ru.chromeav.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author a.khromov
 * @since 02.06.2023
 */
public class FizzBuzz {
    private static final String Fizz = "Fizz";
    private static final String Buzz = "Buzz";
    private static final String FizzBuzz = "FizzBuzz";
    public List<String> fizzBuzz(int n) {
        int fizzCount = 0;
        int buzzCount = 0;
        var arr = new ArrayList<String>(n+1);
        for (int i = 1; i <= n; i++) {
            fizzCount++;
            buzzCount++;
            if (fizzCount == 3 && buzzCount == 5) {
                arr.add(FizzBuzz);
                fizzCount = 0;
                buzzCount = 0;
            } else if (fizzCount == 3) {
                arr.add(Fizz);
                fizzCount = 0;
            } else if (buzzCount == 5) {
                arr.add(Buzz);
                buzzCount = 0;
            } else {
                arr.add(String.valueOf(i));
            }
        }
        return arr;
    }
}
