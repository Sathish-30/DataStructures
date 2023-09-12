package arrays;

import java.util.Arrays;

public class ArrayProblemOptimalSolution implements Problem{
    public void secondLargest(int[] arr){
        int len = arr.length;
        int largest = 0 , secondLargest = 0;
        for(int i = 0 ; i < len ; i++){
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] < largest){
                    secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
