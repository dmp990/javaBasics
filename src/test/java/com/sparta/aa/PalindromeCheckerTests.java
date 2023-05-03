package com.sparta.aa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeCheckerTests {

    @Test
    @DisplayName("returns false for null inputs")
    void checkForNull() {
        Assertions.assertEquals(false, PalindromeChecker.checkPalindromeUsingBuilder(null));
    }

    @Test
    @DisplayName("returns false for words shorter than three characters")
    void checkForShorterWords() {
        Assertions.assertEquals(false, PalindromeChecker.checkPalindromeUsingBuilder("aa"));
    }

    String[] words = {"kayak", "deified", "rotator", "repaper", "deed", "peep", "wow", "noon", "civic", "racecar", "level", "mom"};
    @Test
    @DisplayName("returns true for palindromes")
    void checkForPalindromes() {
        for (int i = 0; i < words.length; i++) {
            Assertions.assertEquals(true, PalindromeChecker.checkPalindromeUsingBuilder(words[i]));
        }
    }

    String[] nonPalins = {"kayaak", "deifaied", "roftator", "rdepaper", "dgeed", "pceep", "wotw", "nooonn", "civiiic", "racecaaar", "leveel", "morm"};
    @Test
    @DisplayName("returns false for non palindromes")
    void checkForNonPalindromes() {
        for (int i = 0; i < nonPalins.length; i++) {
            Assertions.assertEquals(false, PalindromeChecker.checkPalindromeUsingBuilder(nonPalins[i]));
        }
    }
}
