package arrays;

public class ArrayProblemOptimalSolution implements Problem{

    // The TC of the Below code is O(N)
    public void secondLargest(int[] arr){
        int len = arr.length;
        int largest = arr[0] , secondLar = -1;
        for(int i = 1 ; i < len ; i++){
            if(arr[i] > largest) {
                secondLar = largest;
                largest = arr[i];
            }else if(arr[i] > secondLar && arr[i] < largest){
                    secondLar = arr[i];
            }
        }
        System.out.println(secondLar);
    }

    // The TC of the below code is O(N)
    public void secondSmallest(int[] arr){
        int len = arr.length;
        int smallest = arr[0], secondSmall = Integer.MAX_VALUE;
        for(int i = 0 ; i < len ; i++){
            if(arr[i] < smallest){
                secondSmall = smallest;
                smallest = arr[i];
            }else if(arr[i] < secondSmall && arr[i] > smallest){
                secondSmall = arr[i];
            }
        }
        System.out.println(secondSmall);
    }

    public boolean checkSortedArray(int[] arr){
        boolean status = false;
        int len = arr.length;
        for(int i = 1 ; i < len ; i++){
            if(!(arr[i] >= arr[i - 1])){
                status = true;
                break;
            }
        }
        return !status;
    }

    /* Removed the duplicate element with two pointer approach , Setting the initial index i = 0 and j = 1 , where it is the next
    corresponding index and check if next element is not equal or not if not equal add element to the i+1 index , where it is the index of next
    non duplicate element
    */
    public void removeDuplicateInSortedArr(int[] arr){
        int i = 0;
        int len = arr.length;
        for(int j = 1 ; j < len ; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i = i + 1;
            }
        }
    }
}
