package sorting;

public class SelectionSort implements Sort{
    public void sort(int[] arr){
        // It will add sorted element to the sorted sub Array part
        int len = arr.length;
        for(int i = 0 ; i < len - 1 ; i++){
            int min_index = i;
            for(int j = i + 1 ; j < len ; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}
