package arrays.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
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

    public void moveZerosToLast(int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        int arrLen = arr.length;
        for(int e : arr){
            if(e != 0){
                temp.add(e);
            }
        }
        int tempLen = temp.size();
        for(int i = 0 ; i < tempLen ; i++){
            arr[i] = temp.get(i);
        }
        for(int i = tempLen ; i < arrLen ; i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void unionOfTwoArray(){
        int[] arr1 = {1 , 1, 2 , 3, 4, 5};
        int[] arr2 = {2 , 3, 4 , 4 , 5 ,6};
        int n1 = arr1.length , n2 = arr2.length;
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0 ; i < n1 ; i++){
            set.add(arr1[i]);
        }
        for(int i = 0 ; i < n2 ; i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
    }

}
