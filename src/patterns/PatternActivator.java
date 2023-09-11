package patterns;
import java.util.Scanner;
public class PatternActivator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PatternImplementation pattern = new PatternImplementation();
        pattern.pattern19(in.nextInt());
    }
}
