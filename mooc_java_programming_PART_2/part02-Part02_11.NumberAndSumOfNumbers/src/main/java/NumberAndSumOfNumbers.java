
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = 0;
        int sums = 0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 0){
                break;
            } else if (num < 0 || num > 0) {
                nums = nums +1;
                sums = sums + num;
            }
            
        }
        System.out.println("Number of numbers: "+nums);
        System.out.println("Sum of the numbers: "+sums);
    }
}
