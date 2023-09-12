package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of array elements : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        int len = arr.length;
        for(int i = 0 ; i < len ; i++){
            System.out.print("Enter the elements : ");
            arr[i] = in.nextInt();
        }
        Sort arrays = new QuickSort();
        arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
