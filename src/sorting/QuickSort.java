package sorting;

public class QuickSort implements Sort{
    public void sort(int[] arr){
        int len = arr.length - 1;
        partition(arr , 0 , len);
    }
    public void partition(int[] arr , int low , int high){
        if(low < high) {
            int pivot = pIndex(arr, low, high);
            partition(arr, low, pivot - 1);
            partition(arr, pivot + 1, high);
        }
    }


    public int pIndex(int[] arr , int low , int high){
        int i = low , j = high;
        int pivot = arr[low];
        while(i < j){
            while(arr[i] <= pivot && i <= high - 1){
                i++;
            }
            while(arr[j] > pivot && j >= low + 1){
                j--;
            }
            if(i < j){
                swap(arr ,

                        i , j);
            }
        }
        swap(arr , low , j);
        return j;
    }
    public void swap(int[] arr , int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
