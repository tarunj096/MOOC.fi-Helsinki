
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        int sec = Math.abs(first);
        System.out.println(sec);

    }
}
