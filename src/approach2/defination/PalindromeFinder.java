package approach2.defination;

public class PalindromeFinder {
    public boolean isPalindrome(String inputString) {
        boolean response = true;
        int middle = inputString.length() / 2;
        for (int i = 0; i < middle; i++) {
            if (inputString.charAt(i) == inputString.charAt(inputString.length() - 1 - i)) {
            } else {
                response = false;
                break;
            }
        }
        return response;
    }
    }

