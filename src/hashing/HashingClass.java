package hashing;
import java.util.*;
public class HashingClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        int[] search = new int[k];
        for(int i = 0 ; i < arr.length ; i++){
            search[i] = in.nextInt();
        }
        HashingImplementation hi = new HashingImplementation();
        hi.countOccurenceByMap(arr , search);
    }
}
