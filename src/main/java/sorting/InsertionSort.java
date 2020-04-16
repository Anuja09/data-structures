package main.java.sorting;

import java.time.Duration;
import java.time.Instant;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class InsertionSort {
    public static void main(String[] args) {
        Integer[] array = {8, 5, 2, 4, 1, 9, 6, 45, 56, 23, 12, 34, 90, 78, 67, 43, 3, 35, 435345, 434, 4656, 323, 68, 22, 808
                , 42, 77978, 41, 21, 25, 18, 454, 657, 494, 8789, 459, 324, 5464, 232436, 91};
        sort(array);
    }

    public static void sort(Integer[] array) {
        Consumer<Integer> print = i -> System.out.print(i + " ");
        System.out.print("Input  : ");
        Stream.of(array).forEach(print);

        Instant start = Instant.now();

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }

        Instant end = Instant.now();

        System.out.print("\nOutput : ");
        Stream.of(array).forEach(print);
        System.out.println("\nTime Elapsed (Milliseconds) : " + Duration.between(start, end).toMillis());
    }
}
