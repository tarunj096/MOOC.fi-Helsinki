
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            } else if ( num > 0){
                nums = nums + 1;
                sums = sums + num;
            }
        }
        if(nums > 0) {
            avg = (float)sums/nums;
            System.out.println(+avg);
        } else {
            System.out.println("Cannot calculate the average");  
        }
    }
}
