package com.popovich.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SorterTest {
    private final int[] elementsArray = {10, 1, 3, 5, 10, 2, 6, 4, 9, 7, 8};
    Sorter sorter = new Sorter();

    @Test
    public void testingBubbleSort() {
        int[] sortedArray = sorter.sortBubble(elementsArray);

        for (int i = 0; i < sortedArray.length - 1; i++){
            assertTrue(sortedArray[i] <= sortedArray[i+1]);
        }
    }

    @Test
    public void testingBubbleSortOptimized() {
        int[] sortedArray = sorter.sortBubbleOptimized(elementsArray);

        for (int i = 0; i < sortedArray.length - 1; i++){
            assertTrue(sortedArray[i] <= sortedArray[i+1]);
        }
    }

    @Test
    public void testingBubbleSortInsertion() {
        int[] sortedArray = sorter.sortInsertion(elementsArray);

        for (int i = 0; i < sortedArray.length - 1; i++){
            assertTrue(sortedArray[i] <= sortedArray[i+1]);
        }
    }
}
