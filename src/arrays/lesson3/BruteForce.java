package arrays.lesson3;

public class BruteForce {
   // Find the missing value in the array
   // The time complexity will be O(n * n)
   // Where the better solution may be obtained using the hashmap 
   public void findMissingValue(){
      int[] arr = {3,0,1};
      int len = arr.length , missing = 0;
      for(int i = 1 ; i <= len ; i++){
         int flag = 0;
         for(int j = 0 ; j < len ; j++){
            if(arr[j] == i){
               flag = 1;
            }
         }
         if(flag == 0){
            missing = i;
            break;
         }
      }
      System.out.println(missing);
   }
}
