package com.sparta.aa;

import org.junit.jupiter.api.Assertions;

public class PalindromeChecker {
    public static void main(String[] args) {
        //checkPalins();

        System.out.println(checkPalindromeUsingBuilder("repaper"));

    }

    public static void checkPalins() {
        String[] words = {"kayak", "deified", "rotator", "repaper", "deed", "peep", "wow", "noon", "civic", "racecar", "level", "mom"};
        for (int i = 0; i < words.length; i++) {
            System.out.println(PalindromeChecker.isAPalindrome(words[i]));
        }
    }

    public static boolean isAPalindrome(String word) {
        if (word == null || word.length() <= 2) {
            return false;
        }
        int length = word.length();
        String copied = word.toLowerCase();
        for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
            if (copied.charAt(i) != copied.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindromeUsingBuilder(String word) {
        if (word == null || word.length() <= 2) {
            return false;
        }
        StringBuilder copy1 = new StringBuilder(word);
        StringBuilder copy2 = new StringBuilder(word);
        return copy1.compareTo(copy2.reverse()) == 0;
    }
}
