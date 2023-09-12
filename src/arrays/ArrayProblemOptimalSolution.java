package arrays;

import java.util.Arrays;

public class ArrayProblemOptimalSolution implements Problem{
    public void secondLargest(int[] arr){
        int len = arr.length;
        int largest = 0 , secondLar = 0;
        for(int i = 0 ; i < len ; i++){
            if(arr[i] > largest) {
                secondLar = largest;
                largest = arr[i];
            }else if(arr[i] > secondLar && arr[i] < largest){
                    secondLar = arr[i];
            }
        }
        System.out.println(secondLar);
    }
}
