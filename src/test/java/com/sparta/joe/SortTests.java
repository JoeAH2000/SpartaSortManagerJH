package com.sparta.joe;

import com.sparta.joe.sorters.binarytreesort.BinaryTreeSort;
import com.sparta.joe.sorters.bubblesort.BubbleSort;
import com.sparta.joe.sorters.insertionsort.InsertionSort;
import com.sparta.joe.sorters.mergesort.MergeSort;
import com.sparta.joe.sorters.quicksort.QuickSort;
import com.sparta.joe.sorters.selectionsort.SelectionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTests {
    @Test
    void bubbleSortTest() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] unsortedArray = {3, 5, 2, 4, 1};
        int[] sortedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(sortedArray, bubbleSort.sortArray(unsortedArray));
    }

    @Test
    void insertionSortTest() {
        InsertionSort insertionSort = new InsertionSort();
        int[] unsortedArray = {3, 5, 2, 4, 1};
        int[] sortedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(sortedArray, insertionSort.sortArray(unsortedArray));
    }

    @Test
    void mergeSortTest() {
        MergeSort mergeSort = new MergeSort();
        int[] unsortedArray = {3, 5, 2, 4, 1};
        int[] sortedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(sortedArray, mergeSort.sortArray(unsortedArray));
    }

    @Test
    void quickSortTest() {
        QuickSort quickSort = new QuickSort();
        int[] unsortedArray = {3, 5, 2, 4, 1};
        int[] sortedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(sortedArray, quickSort.sortArray(unsortedArray));
    }

    @Test
    void selectionSortTest() {
        SelectionSort selectionSort = new SelectionSort();
        int[] unsortedArray = {3, 5, 2, 4, 1};
        int[] sortedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(sortedArray, selectionSort.sortArray(unsortedArray));
    }

    @Test
    void binaryTreeSortTest() {
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort();
        int[] unsortedArray = {3, 5, 2, 4, 1};
        int[] sortedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(sortedArray, binaryTreeSort.sortArray(unsortedArray));
    }
}
