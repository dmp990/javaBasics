package com.sparta.aa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTests {

    // annotations carry metadata
    @ParameterizedTest
    @ValueSource(ints = {5, 8, 12})
    @DisplayName("check that 5, 8, 12 returns Good Morning")
    void checkForGoodMorning(int time) {
        Assertions.assertEquals("Good morning!", Program.getGreeting(time));
    }
}
