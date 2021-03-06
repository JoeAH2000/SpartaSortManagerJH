package com.sparta.joe.start;

import com.sparta.joe.sorters.Sorter;
import com.sparta.joe.util.ArrayPrinter;
import com.sparta.joe.util.RandomArray;

import java.util.Scanner;

public class Starter {
    public static void start() {
        System.out.println("Welcome to the Sort Manager program!");

        int sortSelected = 0;
        int arraySize = 0;
        int[] unsortedArray = null;

        while(sortSelected < 1 || sortSelected > 6) {
            sortSelected = InputHandler.searchSelect();

            if(sortSelected < 1 || sortSelected > 6) {
                System.out.println("Invalid selection, please try again");
            }
        }

        while(arraySize < 1) {
            arraySize = InputHandler.arraySize();

            if(arraySize < 1) {
                System.out.println("Invalid selection, please try again");
            }
        }
        unsortedArray = RandomArray.randomIntArray(arraySize, 1, 50);

        Sorter sorter = SortFactory.getSorter(sortSelected);

        System.out.println("Unsorted Array:");
        ArrayPrinter.arrayPrint(unsortedArray);

        double startTime = System.nanoTime();
        int[] sortedArray = sorter.sortArray(unsortedArray);
        double endTime = System.nanoTime();

        System.out.println("Sorted Array:");
        ArrayPrinter.arrayPrint(sortedArray);

        System.out.println("Total time taken: " + (endTime-startTime) + " nanoseconds.");


    }
}
