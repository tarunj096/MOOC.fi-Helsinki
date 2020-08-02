
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int mul =1;
        while(num>0){
            mul = num * mul;
            num--;
        }
        System.out.println("Factorial: "+mul);
    }
}
