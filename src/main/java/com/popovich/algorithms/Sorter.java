package com.popovich.algorithms;

public class Sorter {

    public Sorter() {
    }

    public int[] sortBubble(int[] elementsArray) {
        for (int i = elementsArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (elementsArray[j] > elementsArray[j + 1]) {
                    int buffer = elementsArray[j];
                    elementsArray[j] = elementsArray[j + 1];
                    elementsArray[j + 1] = buffer;
                }
            }
        }
        return elementsArray;
    }

    public int[] sortBubbleOptimized(int[] elementsArray) {
        boolean sorted = false;
        int buffer;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < elementsArray.length - 1; i++) {
                if (elementsArray[i] > elementsArray[i + 1]) {
                    buffer = elementsArray[i];
                    elementsArray[i] = elementsArray[i + 1];
                    elementsArray[i + 1] = buffer;
                    sorted = false;
                }
            }
        }
        return elementsArray;
    }

    public int[] sortInsertion (int[] elementsArray) {
        for (int i = 0; i < elementsArray.length; i++) {
            int leftElement = elementsArray[i];
            for (int j = i - 1; j >= 0; j--) {
                if (leftElement < elementsArray[j])  {
                    elementsArray[j + 1] = elementsArray[j];
                }
                else {
                    break;
                }
            }
        }
        return elementsArray;
    }

}
