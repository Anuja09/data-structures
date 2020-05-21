package main.java.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        binarySearch(array, 0, array.length - 1, 5);
        binarySearch(array, 0, array.length - 1, 100);
    }

    private static int binarySearch(int[] array, int start, int end, int key) {
        if (start > end) {
            System.out.println(key + " Not Found!");
            return -1;
        }
        int mid = (start + end) / 2;

        if (array[mid] == key) {
            System.out.println(key + " Found at index " + mid);
            return mid;
        }
        if (array[mid] > key) {
            return binarySearch(array, start, mid - 1, key);
        } else {
            return binarySearch(array, mid + 1, end, key);
        }

    }
}
