package arrays;

import java.util.Arrays;
import java.util.TreeSet;

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

    public void removeDuplicateInSortedArr(int[] arr){
        int len = arr.length;
        TreeSet<Integer> set = new TreeSet<>();
        for(int e : arr){
            set.add(e);
        }
        int index = 0;
        for(int e : set){
            arr[index] = e;
            index++;
        }
        for(int i = index ; i < len ; i++){
            arr[i] = -1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
