
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zero = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 0){
                break;
            } else if (num > 0){
                zero = zero + 1;
            
            } else if (num < 0 ){
                zero = zero + 1;
            }
            
        }
        System.out.println("Number of numbers: "+ zero);
    }
}
