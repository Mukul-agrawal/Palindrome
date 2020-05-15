package approach3.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String :");
        String inputString = scanner.nextLine();
        StringBuilder sb = new StringBuilder(inputString);
        if (inputString.equalsIgnoreCase(String.valueOf(sb.reverse())))
            System.out.println("String is Palindrome.");
        else
            System.out.println("String is not Palindrome.");
    }
}
