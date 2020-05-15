package approach1.adt.defination;

import approach1.adt.PalindromeADT;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeFinder implements PalindromeADT {
    @Override
    public Deque<Character> fillStack(String inputString) {
        Deque<Character> charStack = new ArrayDeque<>();
        for (int i = 0; i < inputString.length(); i++) {
            charStack.push(inputString.charAt(i));
        }
        return charStack;
    }

    @Override
    public String buildReverse(String inputString) {
        Deque<Character> charStack = fillStack(inputString);
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }
        return result.toString();
    }

    @Override
    public boolean isPalindrome(String inputString) {
        return false;
    }
}
