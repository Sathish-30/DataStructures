package arrays.lesson4;

public class BruteForce {
   // Longest subarray with sum K
   // As it is a brute force algorithm
   public void subArraySum(int[] arr , int k){
      int len = arr.length , maxLen = 0;
      for(int i = 0 ; i < len ; i++){
         int sum = 0;
         for(int j = i ; j < len ; j++){
            sum += arr[j];
            if(sum == k){
               maxLen = Math.max(maxLen , (j - i)+1);
            }
         }
      }
      System.out.println(maxLen);
   }
}
