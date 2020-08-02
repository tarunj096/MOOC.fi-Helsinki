
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int num = Integer.valueOf(scanner.nextInt());
        System.out.print("Where from? ");
        int num1 = Integer.valueOf(scanner.nextInt());
        while(num1 <= num){
            System.out.println(num1);
            num1++;
        }
        // Write your program here
    }
}
