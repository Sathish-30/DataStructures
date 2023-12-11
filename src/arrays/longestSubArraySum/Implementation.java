package arrays.longestSubArraySum;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Implementation {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 1, 1 , 1 , 1 , 4 ,2,3 };
        int k = 6;
        betterSolution(arr , k);
    }
    static void bruteForce(int[] arr , int k){
        int len = arr.length , maxLen = 0;
        for(int i = 0 ; i < len ; i++){
            int sum = 0;
            for(int j = i ; j < len ; j++){
                sum += arr[j];
                if(sum == k){
                    int leng = (j - i) + 1;
                    maxLen = Math.max(maxLen , leng);
                }
            }
        }
        System.out.println(maxLen);
    }

    static void betterSolution(int[] arr , int k){
        int sum = 0 , len = arr.length , maxLen = 0;
        LinkedHashMap<Integer , Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < len ; i++){
            sum += arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen , i + 1);
            }
            int rem = sum - k;
            if(map.containsKey(rem)){
                maxLen = Math.max(maxLen , i - map.get(rem) + 1);
            }
            map.put(sum , i + 1);
        }
        System.out.println(map);
        System.out.println(maxLen);
    }
}
