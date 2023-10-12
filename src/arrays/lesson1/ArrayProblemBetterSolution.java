package arrays.lesson1;

import java.util.Arrays;

public class ArrayProblemBetterSolution implements Problem {
    public void secondLargest(int[] arr){
        // TC O(2N)
        int largest = arr[0];
        int secondLargest = 0;
        int len = arr.length;
        // The below loop runs for O(N)
        for(int i = 0 ; i < len ; i++){
            if(arr[i] >= largest){
                largest = arr[i];
            }
        }
        // And the below loop also runs for O(N)
        for(int i = 0 ; i < len ; i++){
            if(arr[i] != largest && arr[i] >= secondLargest){
                secondLargest = arr[i];
                break;
            }
        }
        // So it totally runs for O(N + N)
        System.out.println(secondLargest);
    }

    // Left rotate
    public void leftRotate(int[] arr , int d){
        int len = arr.length;
        int[] temp = new int[len];
        for(int i = d ; i < len ; i++){
            temp[i - d] = arr[i];
        }
        for(int i = 0 ; i < d ; i++){
            temp[len - d + i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }

    // Right rotate
    public void rightRotate(int[] arr , int d){
        int len = arr.length ;
        int[] temp = new int[len];
        for(int i = len - d , j = 0 ; i < len ; i++ , j++){
            temp[j] = arr[i];
        }

        for(int i = 0 ; i < len - d ; i++){
            temp[d + i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
