package arrays;

import java.util.Scanner;

public class ArrayImplementation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of array elements : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        Problem ap = new ArrayProblemOptimalSolution();
        ap.secondLargest(arr);
    }
}