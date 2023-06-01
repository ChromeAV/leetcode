package ru.chromeav.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

/**
 * @author a.khromov
 * @since 01.06.2023
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if ((s.length() % 2) == 1) {
            return false;
        }

        var chars = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>(chars.length);
        for (int i = 0; i < chars.length; i++) {
            var cursor = chars[i];
            if (stack.isEmpty()) {
                stack.addFirst(cursor);
            } else if (Objects.equals(stack.peekFirst(), pair(cursor))) {
                stack.pollFirst();
            } else {
                if ((chars.length - i) < stack.size()) {
                    return false;
                } else {
                    stack.addFirst(cursor);
                }
            }
        }
        return stack.isEmpty();
    }

    private Character pair(Character character) {
        return switch (character) {
            case '(', '{', '[' -> null;
            case ')' -> '(';
            case '}' -> '{';
            case ']' -> '[';
            default -> throw new IllegalStateException(String.valueOf(character));
        };
    }
}
