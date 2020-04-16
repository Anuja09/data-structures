package main.java.sorting;

import java.time.Duration;
import java.time.Instant;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] array = {8, 5, 2, 4, 1, 9, 6, 45, 56, 23, 12, 34, 90, 78, 67, 43, 3, 35, 435345, 434, 4656, 323, 68,
                22, 808, 42, 77978, 41, 21, 25, 18, 454, 657, 494, 8789, 459, 324, 5464, 232436, 91};
        sort(array);
    }

    public static void sort(Integer[] array) {
        Consumer<Integer> print = i -> System.out.print(i + " ");
        System.out.print("Input  : ");
        Stream.of(array).forEach(print);

        Instant start = Instant.now();

        mergeSort(array, 0, array.length - 1);

        Instant end = Instant.now();

        System.out.print("\nOutput : ");
        Stream.of(array).forEach(print);
        System.out.println("\nTime Elapsed (Milliseconds) : " + Duration.between(start, end).toMillis());
    }

    private static void mergeSort(Integer[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
    }

    private static void merge(Integer[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1; i++) {
            L[i] = array[left + i];
        }
        for (int i=0;i<n2;i++) {
            R[i] = array[mid+1+i];
        }

        int i=0, j=0;
        int k=left;
        while(i<n1 && j<n2) {
            if(L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1) {
            array[k] = L[i];
            k++;
            i++;
        }
        while(j<n2) {
            array[k] = R[j];
            k++;
            j++;
        }
    }
}
