package Topics.Other.isValid;

import java.util.ArrayDeque;

public class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (Character c : s.toCharArray()) {
            if (Solution.leftBracket(c)){
                stack.addLast(c);
            }else if (!stack.isEmpty() && Solution.bracketsMatch(stack.peekLast(), c)){
                stack.removeLast();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean bracketsMatch(Character c1, Character c2) {
        if (c1 == '{' && c2 == '}') return true;
        if (c1 == '[' && c2 == ']') return true;
        return c1 == '(' && c2 == ')';
    }

    public static boolean leftBracket(Character c) {
        return c == '(' || c == '{' || c == '[';
    }
}
