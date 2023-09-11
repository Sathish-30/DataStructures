package recursion;

public class Implemenatation {

    // Functional Implementation
    public int sumOfNumber(int n) {
        if(n == 1){
            return n;
        }else{
            return n + sumOfNumber(n - 1);
        }
    }

    // Paramaterized Implementation

    public void sumOfNumberParam(int n , int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        sumOfNumberParam(n - 1 , sum + n);
    }

    // It's a Factorial 5 * 4 * 3 * 2 * 1
    public int productOfNumber(int n){
        if(n == 1){
            return n;
        }else{
            return n * productOfNumber(n - 1);
        }
    }

    // Recursion using two pointers
    public void reverseUsingTwoPointers(int[] arr , int start , int end){
        if(start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseUsingTwoPointers(arr, start + 1, end - 1);
    }

    public void reverse(int[] arr , int start , int n){
        if(start > n / 2){
            return;
        }
        int temp = arr[n - start];
        arr[n - start] = arr[start];
        arr[start] = temp;
        reverse(arr , start + 1 , n);
    }

    public boolean palindrome(String str , int start , int n){
        // This palindrome program return a functional boolean value
        if(start >= n / 2){
            return true;
        }else{
            if(str.charAt(start) != str.charAt(n - start - 1)){
                // if a single character is not same , then it will return false
                return false;
            }else{
                return palindrome(str , start + 1 , n);
            }
        }
    }

    public int fibo(int n){
        if( n <= 1 ){
            return n;
        }else{
            int secondLast = fibo(n - 1);
            int last = fibo(n - 2);
            return secondLast + last;
        }
    }
}
