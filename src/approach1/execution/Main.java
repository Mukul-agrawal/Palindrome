package approach1.execution;

import approach1.defination.PalindromeFinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeFinder palindromeFinder = new PalindromeFinder();
        System.out.println("Enter a String :");
        String inputString = scanner.nextLine();
        boolean flag = palindromeFinder.isPalindrome(inputString);
        if (flag)
            System.out.println("String is Palindrome.");
        else
            System.out.println("String is not Palindrome.");
    }
}
