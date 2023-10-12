package arrays.lesson2;

import java.util.ArrayList;
import java.util.Stack;

public class ArrayProblems2 {
    public void moveZerosLast(int[] arr){
        int len = arr.length;
        int j = findIndexOfZero(arr);
        for(int i = j + 1 ; i < len ; i++){
            if(arr[i] != 0){
                swap(arr , i , j);
                j++;
            }
        }
    }

    public void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int findIndexOfZero(int[] arr){
        int index = -1;
        int i = 0;
        for(int e : arr){
            if(e == 0){
                index = i;
            }
            i++;
        }
        return index;
    }

    public void union(){
        int[] arr1 = {1 , 1 , 2, 3 , 4, 5};
        int[] arr2 = {2 , 3, 4, 4, 5, 6};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0 , j = 0;
        Stack<Integer> stack = new Stack<>();
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j] && (stack.isEmpty() || stack.peek() != arr1[i])){
                stack.add(arr1[i]);
                i++;
            }
            else if(stack.peek() == arr1[i]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
        }
        while(i < n1){
            if(stack.peek() != arr1[i]) {
                stack.push(arr1[i]);
            }
            i++;
        }
        while(j < n2){
            if(stack.peek() != arr2[j]){
                stack.push(arr2[j]);
            }
            j++;
        }
        System.out.println(stack);
    }
}
