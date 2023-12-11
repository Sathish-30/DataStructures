package arrays.lesson3;

public class OptimalSolution {
   // Where it can be implemented using two methods a sum of digits and 
   public void findMissingValue(){
      int[] arr = {3 , 0 ,1};
      int n = arr.length;
      int sum = n * ((n + 1) / 2);
      int tot = 0;
      for(int e : arr){
         tot += e;
      } 
      System.out.println(sum - tot);
   }
}