package com.visu.tasks.binarysearch;

public class BinarySearch {
    private double[] elements;
    private int ELEMENT_NOT_FOUND = -1;

    public BinarySearch(double[] elements) {
        this.elements = elements;
    }

    public int find(double xElement) {
        if (elements.length == 0) {
            return ELEMENT_NOT_FOUND;
        }

        int leftBorder = 0;
        int rightBorder = elements.length - 1;
        int delimiter = rightBorder / 2;

        while (leftBorder <= rightBorder) {
            if (elements[delimiter] == xElement) {
                return delimiter;
            } else if (elements[delimiter] < xElement) {
                leftBorder = delimiter + 1;
            } else {
                rightBorder = delimiter;
            }

            delimiter = leftBorder + (rightBorder - leftBorder) / 2;
        }

        return ELEMENT_NOT_FOUND;
    }
}
