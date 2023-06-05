package ru.chromeav.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author a.khromov
 * @since 02.06.2023
 */
class FizzBuzzTest {
    private final FizzBuzz instance = new FizzBuzz();

    @Test
    public void example1(){
        assertEquals(List.of("1","2","Fizz"), instance.fizzBuzz(3));
    }

    @Test
    public void example2(){
        assertEquals(List.of("1","2","Fizz","4","Buzz"), instance.fizzBuzz(5));
    }

    @Test
    public void example3(){
        assertEquals(List.of("1","2","Fizz","4","Buzz","Fizz","7",
                "8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"),
                instance.fizzBuzz(15));
    }

}