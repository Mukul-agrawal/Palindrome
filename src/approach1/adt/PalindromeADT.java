package approach1.adt;

import java.util.Deque;

public interface PalindromeADT {
    Deque<Character> fillStack(String inputString);

    String buildReverse(String inputString);

    boolean isPalindrome(String inputString);
}
