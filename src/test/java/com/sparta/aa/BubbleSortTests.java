package com.sparta.aa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTests {

    int[] arr = {10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
    int[] sorted = {7, 10, 11, 14, 16, 18, 25, 28, 30, 50};

    @Test
    @DisplayName("check if the array of positive values has properly been sorted in ascending order")
    void checkForPositiveArray() {

        BubbleSort.bubbleSort(arr);
        Assertions.assertArrayEquals(sorted, arr);
    }

    @Test
    @DisplayName("check if the array with some negative values has properly been sorted in ascending order")
    void checkForArrayWithNegativeValues() {
        int[] arr = {-1, 25, -4, 3, 44};
        int[] sorted = {-4, -1, 3, 25, 44};
        BubbleSort.bubbleSort(arr);
        Assertions.assertArrayEquals(sorted, arr);
    }
}
