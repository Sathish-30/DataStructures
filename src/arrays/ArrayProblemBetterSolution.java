package arrays;

public class ArrayProblemBetterSolution implements Problem{
    public void secondLargest(int[] arr){
        // TC O(2N)
        int largest = arr[0];
        int secondLargest = 0;
        int len = arr.length;
        // The below loop runs for O(N)
        for(int i = 0 ; i < len ; i++){
            if(arr[i] >= largest){
                largest = arr[i];
            }
        }
        // And the below loop also runs for O(N)
        for(int i = 0 ; i < len ; i++){
            if(arr[i] != largest && arr[i] >= secondLargest){
                secondLargest = arr[i];
                break;
            }
        }
        // So it totally runs for O(N + N)
        System.out.println(secondLargest);
    }


}
