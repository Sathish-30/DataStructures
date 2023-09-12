package sorting;

public class MergeSort implements Sort{

    @Override
    public void sort(int[] arr) {
        divide(arr , 0 , arr.length - 1);
    }
    public void divide(int[] arr , int low , int high){
        if(low >= high){
            return;
        }
        int mid = (low + high) / 2;
        divide(arr , low , mid);
        divide(arr , mid + 1 , high);
        merge(arr , low , mid , high);
    }

    public void merge(int[] arr , int low , int mid , int high){
        int[] tempArr = new int[(high - low) + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                tempArr[k] = arr[left];
                left++;
            }else{
                tempArr[k] = arr[right];
                right++;
            }
            k++;
        }
        while(left <= mid){
            tempArr[k] = arr[left];
            left++;
            k++;
        }
        while(right <= high){
            tempArr[k] = arr[right];
            right++;
        }
        for(int i = low , j = 0; i <= high ; i++ , j++){
            arr[i] = tempArr[j];
        }
    }
}

