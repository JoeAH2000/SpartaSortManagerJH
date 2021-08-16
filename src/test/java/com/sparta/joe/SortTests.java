package com.sparta.joe;

import com.sparta.joe.sorters.bubblesort.BubbleSort;
import com.sparta.joe.sorters.insertionsort.InsertionSort;
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
}
