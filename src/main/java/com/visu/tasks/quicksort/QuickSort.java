package com.visu.tasks.quicksort;

public class QuickSort {
    private double[] array;
    private PivotType pivotType;

    public QuickSort(double[] array, PivotType pivotType) {
        this.array = array;
        this.pivotType = pivotType;
    }

    public void sort() {
        int leftBorder = 0;
        int rightBorder = array.length - 1;
        int pivot = getPivot(leftBorder, rightBorder);
        sortSubArray(leftBorder, rightBorder, pivot);
    }

    private void sortSubArray(int leftBorder, int rightBorder, int pivot) {
        if (leftBorder >= rightBorder) {
            return;
        }

        double pivotValue = array[pivot];
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int curIndex = leftBorder; curIndex <= rightBorder; curIndex++) {
                if (((array[curIndex] < pivotValue) && (curIndex > pivot))
                        || ((array[curIndex] >= pivotValue) && (curIndex < pivot))) {
                    swap(curIndex, pivot);
                    pivot = curIndex;
                    sorted = false;
                }
            }
        }
        if (leftBorder != pivot) {
            sortSubArray(leftBorder, pivot - 1, getMiddlePivot(leftBorder, pivot - 1));
            sortSubArray(pivot, rightBorder, getMiddlePivot(pivot, rightBorder));
        }
    }

    private int getPivot(int leftBorder, int rightBorder) {
        int pivot;
        switch (pivotType) {
            case FIRST:
                pivot = getFirstPivot(leftBorder);
                break;
            case MIDDLE:
                pivot = getMiddlePivot(leftBorder, rightBorder);
                break;
            case LAST:
                pivot = getLastPivot(rightBorder);
                break;

            default:
                System.out.println("Specified pivot type is not supported. \n" +
                        "Middle Pivot will be used as a default");
                pivot = getMiddlePivot(leftBorder, rightBorder);
                break;
        }

        return pivot;
    }

    private int getFirstPivot(int leftBorder) {
        return leftBorder;
    }

    private int getMiddlePivot(int leftBorder, int rightBorder) {
        return leftBorder + (rightBorder - leftBorder) / 2;
    }

    private int getLastPivot(int rightBorder) {
        return rightBorder;
    }

    private void swap(int first, int second) {
        double firstValue = array[first];
        array[first] = array[second];
        array[second] = firstValue;
    }
}