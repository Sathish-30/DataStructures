package arrays.twoSum;
import java.util.Arrays;
import java.util.HashMap;
public class Implementation {
    public static void main(String[] args) {
        optimalSolution();
    }
    static void bruteForce(int target){
        int prev = 0 , next = 0;
        int[] arr = {2 , 6, 5 ,8 , 11};
        int len = arr.length;
        for(int i = 0 ; i < len - 1 ; i++){
            for (int j = i + 1; j < len; j++) {
                if(arr[i]+arr[j] == target){
                    prev = i;
                    next = j;
                }
            }
        }
        System.out.printf("The index are %d and %d",prev , next);
    }

    static void betterSolution(int target){
        int[] arr = {2 , 6, 5 ,8 , 11};
        int len = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(arr[i] , i);
        }
        for(int i = 0 ; i < len ; i++){
            int val = target - arr[i];
            if(map.containsKey(val)){
                System.out.printf("The index is %d and %d",i , map.get(val));
                break;
            }
        }
    }

    static void optimalSolution(){
        int[] arr = {2 , 6, 5 ,8 , 11};
        Arrays.sort(arr);
        int target = 14;
        int left = 0 , right = arr.length - 1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum ==  target){
                System.out.println("True");
                break;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
    }

}
