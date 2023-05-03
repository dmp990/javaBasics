package com.sparta.aa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTests {

    int[] arr = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
    int[] sorted = {7, 10, 11, 14, 16, 18, 25, 28, 30, 50};

    @Test
    @DisplayName("check if the array has properly been sorted in ascending order")
    void checkForPalindromes() {
        BubbleSort.bubbleSort(arr);
        Assertions.assertArrayEquals(sorted, arr);
    }
}
