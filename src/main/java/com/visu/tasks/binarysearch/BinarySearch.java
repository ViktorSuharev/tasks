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
        int middle = rightBorder / 2;

        while (leftBorder <= rightBorder) {
            if (elements[middle] == xElement) {
                return middle;
            } else if (elements[middle] < xElement) {
                leftBorder = middle + 1;
            } else {
                rightBorder = middle;
            }

            middle = leftBorder + (rightBorder - leftBorder) / 2;
        }

        return ELEMENT_NOT_FOUND;
    }
}
