package arrays.lesson4;

public class OptimalSolution {
    // Using two pointer approach
    public void subArraySum(int[] arr , int k){
        int left = 0 , right = 0 , sum = arr[0] , len = arr.length , maxLen = 0;
        while(right < len){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen , right - left + 1);
            }
            right++;
            if(right < len){
                sum += arr[right];
            }
        }
        System.out.println(maxLen);
    }
}
