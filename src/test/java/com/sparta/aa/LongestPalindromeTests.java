package com.sparta.aa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTests {
    String[] words = {"kayak", "deified", "rotator", "repaper", "deed", "peep", "wow", "noon", "civic", "racecar", "level", "mom"};

    @Test
    @DisplayName("returns true for palindromes")
    void checkForPalindromes() {
        Assertions.assertEquals("deified", LongestPalindrome.findLongestPalindrome(words));
    }
}
