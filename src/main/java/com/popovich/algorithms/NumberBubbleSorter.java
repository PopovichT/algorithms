package com.popovich.algorithms;;

public class NumberBubbleSorter {
    private int elementsNumber;
    private final int[] elementsArray;

    public NumberBubbleSorter(int arrayLength) {
        elementsArray = new int[arrayLength];
        elementsNumber = 0;
    }

    public void put(int value) {
        elementsArray[elementsNumber] = value;
        elementsNumber++;
    }

    public int[] sort() {
        for (int i = elementsNumber - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (elementsArray[j] > elementsArray[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
        return elementsArray;
    }

    public void swap (int firstIndex, int secondIndex) {
        int buffer = elementsArray[firstIndex];
        elementsArray[firstIndex] = elementsArray[secondIndex];
        elementsArray[secondIndex] = buffer;
    }
}
