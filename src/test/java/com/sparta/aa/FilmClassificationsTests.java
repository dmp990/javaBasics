package com.sparta.aa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationsTests {
    @ParameterizedTest
    @ValueSource(ints = {18, 19, 20, 50, 60})
    @DisplayName("returns 'All films are available.' for ages 18 and over")
    void checkFor18(int age) {
        Assertions.assertEquals("All films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("returns 'U, PG, 12 & 15 films are available.' for ages between [15, 18)")
    void checkFor15(int age) {
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("returns 'U, PG & 12 films are available.' for ages between [12, 15)")
    void checkFor12(int age) {
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {8, 9, 10, 11})
    @DisplayName("returns 'U & PG films are available.' for ages between [8, 12)")
    void checkForPG(int age) {
        Assertions.assertEquals("U & PG films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7})
    @DisplayName("returns 'U films are available.' for ages between [4, 8)")
    void checkForU(int age) {
        Assertions.assertEquals("U films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("returns 'No films are available.' for ages less than 4")
    void checkForNo(int age) {
        Assertions.assertEquals("No films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -10})
    @DisplayName("returns 'Invalid Age.' for a zero or a negative age")
    void checkForNegativeAge(int age) {
        Assertions.assertEquals("Invalid Age.", FilmClassifications.availableClassifications(age));
    }
}
