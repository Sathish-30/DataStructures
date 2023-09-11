package hashing;

import java.util.HashMap;

public class HashingImplementation {
    // Integer hashing
    public void countOccurence(int[] arr , int[] search){
        //Occurence get's calculated by Hash Array
         int max = maximum(search);
         int[] hashArr = new int[max + 1];
        for (int k : arr) {
            hashArr[k]++;
        }
        for (int j : search) {
            System.out.printf("The frequency of %d is %d .\n", j, hashArr[j]);
        }
    }
    public static int maximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int e : arr){
            if(e > max){
                max = e;
            }
        }
        return max;
    }

    // Character hashing
    public void characterHashArray(String str , String searchStr){
        int[] hashArray = new int[256];
        char[] arr = str.toCharArray();
        for(char e : arr){
            // The frequency stored according the ascii index
            // ASCII - American standard code for information interchange
            hashArray[e]++;
        }
        char[] search = searchStr.toCharArray();
        for(char e : search){
            System.out.printf("The frequency of %c is %d .\n", e, hashArray[e]);
        }
    }

    public void countOccurenceByMap(int[] arr , int[] search){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int e : arr){
            map.put(e,map.containsKey(e) ? (map.get(e)) + 1 : 1);
        }
        System.out.println(map);
        for(int e : search){
            System.out.printf("The frequency of %d is %d .\n", e, map.getOrDefault(e, 0));
        }
    }
}
