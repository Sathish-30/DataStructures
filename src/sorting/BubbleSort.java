package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort implements Sort{
    // it is opposite to the selection sort , where it pushes the largest element to the last
    // In bubble sort the outer for loop runs n - 1 times and check the adjacent sides if greater then swap it
    // Worst case is O(N^2)
    public void sort(int[] arr) {
        int len = arr.length;
        int i = 0;
        while (i < len - 1) {
            int j = 0;
            boolean status = false;
            while (j < len - 1 - i) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    status = true;
                }
                j++;
            }
            // For a single cycle if there doesn't exists a swap , then the array is sorted
            if (!status) {
                break;
            }
            i++;
        }
    }
}
