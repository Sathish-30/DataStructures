package arrays;

import java.util.Arrays;

public class ArrayProblemBruteForce implements Problem {
    // BruteForce
    @Override
    public void secondLargest(int[] arr){
        //  TC for sorting is N * log(N)
        Arrays.sort(arr);
        int len = arr.length;
        int secondLargest = 0;
        int largest = arr[len - 1];
        boolean status = false;
        for(int i = len - 2 ; i >= 0 ; i--){
            if(arr[i] != largest){
                secondLargest = arr[i];
                status = true;
                break;
            }
        }
        System.out.println((!status) ? -1 : secondLargest);
    }

}
