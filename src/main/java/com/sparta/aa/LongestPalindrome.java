package com.sparta.aa;

public class LongestPalindrome {
    /*
    Create a method that will find the longest palindrome in a sentence. You should use your method from the previous task to support this. The method will take a primitive array of Strings as a parameter. This collection of Strings will represent a sentence
     */
    public static void main(String[] args) {
        String[] sentence = {"deified", "rotator", "abcdefedcba"};
        System.out.println(findLongestPalindrome(sentence));
    }

    public static String findLongestPalindrome(String[] sentence) {
        int max = -1;
        String longest = "";
        for (int i = 0; i < sentence.length; i++) {
            if (PalindromeChecker.checkPalindromeUsingBuilder(sentence[i])) {
                if (sentence[i].length() > max) {
                    max = sentence[i].length();
                    longest = sentence[i];
                }
            }
        }
        return longest;
    }
}
