package com.popovich.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberBubbleSorterTest {

    @Test
    public void testingAlgh() {
        var sorter = new NumberBubbleSorter(10);

        sorter.put(5);
        sorter.put(3);
        sorter.put(4);
        sorter.put(10);
        sorter.put(2);
        sorter.put(6);
        sorter.put(1);
        sorter.put(8);
        sorter.put(7);
        sorter.put(9);

        int[] sortedArray = sorter.sort();

        for (int i = 0; i < sortedArray.length - 1; i++){
            assertTrue(sortedArray[i] <= sortedArray[i+1]);
        }
    }
}
