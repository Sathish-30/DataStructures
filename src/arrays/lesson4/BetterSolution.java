package arrays.lesson4;

import java.util.HashMap;
import java.util.Objects;

public class BetterSolution {
    public void subArraySum(int[] arr , int k){
         HashMap<Integer , Integer> map = new HashMap<>();
         // 2 0 0 3 -> 3
         int sum = 0 , maxLen = 0 , len = arr.length;
         for(int i = 0 ; i < len ; i++){
             sum += arr[i];
             if(sum == k){
                 maxLen = Math.max(maxLen , i+1 );
             }
             int rem = sum - k;
             if(map.containsKey(rem)){
                int l = i - map.get(rem);
                maxLen = Math.max(maxLen , l);
             }
             if(!map.containsKey(sum)) {
                 map.put(sum, i);
             }
         }
        System.out.println(maxLen);
    }
}
