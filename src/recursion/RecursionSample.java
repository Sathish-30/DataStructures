package recursion;
import java.util.Arrays;
import java.util.Scanner;

public class RecursionSample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Implemenatation recursion = new Implemenatation();
        System.out.println(recursion.fibo(in.nextInt()));
    }
}
