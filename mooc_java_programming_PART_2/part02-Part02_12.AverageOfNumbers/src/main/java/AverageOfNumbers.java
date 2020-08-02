
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float avg;
        int nums = 0;
        int sums = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if ( num == 0 ){
                break;
            } else if (num < 0 || num > 0){
                nums = nums + 1;
                sums = sums + num;
            }
        }
        if(nums > 0) {
            avg = (float)sums/nums;
            System.out.println("Average of the numbers: "+avg);
        } else {
            avg = sums/1;
            System.out.println("Average of the numbers: "+avg);  
        }
    }
}
