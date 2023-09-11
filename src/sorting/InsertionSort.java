package sorting;

public class InsertionSort implements Sort{
    public void sort(int[] arr){
        int len = arr.length;
        for(int i = 1 ; i < len ; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] >= temp){
                arr[j + 1] = arr[j];
                j -= 1;
            }
            j += 1;
            arr[j] = temp;
        }
    }
}
