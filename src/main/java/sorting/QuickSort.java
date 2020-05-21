package main.java.sorting;

import java.time.Duration;
import java.time.Instant;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] array = {8, 5, 2, 4, 1, 9, 6, 45, 56, 23,12,34, 90,78, 67,43,3,35, 435345, 434,4656,323,68,22,808
                ,42,77978,41,21,25,18,454,657,494,8789,459,324,5464,232436,91};
        sort(array);
    }

    public static void sort(Integer[] array) {
        Consumer<Integer> print = i -> System.out.print(i + " ");
        System.out.print("Input  : ");
        Stream.of(array).forEach(print);

        Instant start = Instant.now();

        //Quick Sort
        quickSort(array, 0, array.length-1);

        Instant end = Instant.now();

        System.out.print("\nOutput : ");
        Stream.of(array).forEach(print);

        System.out.println("\nTime Elapsed (Milliseconds) : " + Duration.between(start, end).toMillis());
    }

    private static void quickSort(Integer[] array, int low, int high) {
        if(low>=high) return;
        int pivot = partition(array, low, high);
        quickSort(array, low, pivot-1);
        quickSort(array, pivot+1, high);
    }

    private static int partition(Integer[] array, int low, int high) {
        int pivotItem = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivotItem) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array [high];
        array[high] = temp;
        return i+1;
    }
}
