
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int num = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number: ");
        int num2 = Integer.valueOf(scan.nextLine());
        if(num > num2) {
            System.out.println("Greater number is:"+" "+num);
        } else if(num2 > num) {
            System.out.println("Greater number is:"+" "+num2);    
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
