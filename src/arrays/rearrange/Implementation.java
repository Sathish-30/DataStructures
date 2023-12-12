package arrays.rearrange;
import java.util.*;
import java.util.*;
public class Implementation {
    public static void main(String[] args) {
        betterSolution();
    }
    static void betterSolution(){
        // The answer where the solutions are in pos number in even index
        // and negative value in odd index
        int[] arr = {3 , 1 , -2 , -5 , 2 , -4};
        int[] res = new int[arr.length];
        int pos = 0 , neg = 1;
        for (int j : arr) {
            if (j < 0) {
                res[neg] = j;
                neg += 2;
            } else {
                res[pos] = j;
                pos += 2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
