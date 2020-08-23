
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a word: ");
        String name = sc.nextLine();
        System.out.println(name+name+name);

    }
}
