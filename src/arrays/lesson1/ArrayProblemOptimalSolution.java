package arrays.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ArrayProblemOptimalSolution implements Problem {

    // The TC of the Below code is O(N)
    public void secondLargest(int[] arr){
        int len = arr.length;
        int largest = arr[0] , secondLargest = Integer.MIN_VALUE;
        for(int i = 1 ; i < len ; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] != largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("The second largest element is "+secondLargest);
    }

    // The TC of the below code is O(N)
    public void secondSmallest(int[] arr){
        int len = arr.length;
        int smallest = arr[0], secondSmall = Integer.MAX_VALUE;
        for(int i = 1 ; i < len ; i++){
            if(arr[i] < smallest){
                secondSmall = smallest;
                smallest = arr[i];
            }else if(arr[i] != smallest && arr[i] < secondSmall){
                secondSmall = arr[i];
            }
        }
        System.out.println(secondSmall);
    }

    public boolean checkSortedArray(int[] arr){
        boolean status = false;
        int len = arr.length;
        for(int i = 1 ; i < len ; i++){
            if(!(arr[i] >= arr[i - 1])){
                status = true;
                break;
            }
        }
        return !status;
    }

    /* Removed the duplicate element with two pointer approach , Setting the initial index i = 0 and j = 1 , where it is the next
    corresponding index and check if next element is not equal or not if not equal add element to the i+1 index , where it is the index of next
    non duplicate element
    */
    public void removeDuplicateInSortedArr(int[] arr){
        int i = 0;
        int len = arr.length;
        for(int j = 1 ; j < len ; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i = i + 1;
            }
        }
    }

    // Left rotate
    public void rotateLeft(int[] arr , int d){
        int len = arr.length;
        swap(arr , 0 , d - 1);
        swap(arr , d , len - 1);
        swap(arr , 0 , len - 1);
        System.out.println(Arrays.toString(arr));
    }

    public void swap(int[] arr , int start , int end){
        int mid = (start + end) / 2;
        for(int i = start  , j = end ; i <= mid ; i++ , j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public void rotateRight(int[] arr , int d){
        int len = arr.length;
        swap(arr , len - d , len - 1);
        swap(arr , 0 , len - d - 1);
        swap(arr , 0 , len - 1);
        System.out.println(Arrays.toString(arr));
    }

    public void moveZerosToLast(int[] arr){
        int j = firstIndexOfZero(arr) , len = arr.length;
        if(j != -1){
            for(int i = j + 1 ; i < len ; i++){
                if(arr[j] != arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    j = j + 1; 
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int firstIndexOfZero(int[] arr){
        int pos = -1 , len = arr.length;
        for(int i = 0 ; i < len ; i++){
            if(arr[i] == 0){
                pos = i;
                break;
            }
        }
        return pos;
    }

    public void unionOfTwoArray(){
        // It doesn't take the duplicate value and should be in sorted manner
        int[] arr1 = {1 , 1, 2 , 3, 4, 5};
        int[] arr2 = {2 , 3, 4 , 4 , 5 ,6};
        int n1 = arr1.length , n2 = arr2.length;
        int i = 0 , j = 0;
        Stack<Integer> st = new Stack<>();
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                if(st.size() == 0 || st.peek() != arr1[i]){
                    st.push(arr1[i]);
                }
                i++;
            }else{
                 if(st.size() == 0 || st.peek() != arr2[j]){
                    st.push(arr2[j]);
                }
                j++;
            }
        }
        while(i < n1){
            if(st.size() == 0 || st.peek() != arr1[i]){
                st.push(arr1[i]);
            }
            i++;
        }
        while(j < n2){
            if(st.size() == 0 || st.peek() != arr2[j]){
                st.push(arr2[j]);
            }
            j++;
        }
        System.out.println(st);
    }

    public void intersectionOfArray(){
        int[] arr1 = {1 , 1, 2 , 3, 4, 4,5};
        int[] arr2 = {1,2 , 3, 4 , 4 , 5 ,6};
        int n1 = arr1.length , n2 = arr2.length;
        int i = 0 , j = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] == arr2[j]){
                al.add(arr1[i]);
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println(al);
    }
}
