
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        int i = num;
        while(i<=100){
            System.out.println(i);
            i++;
        }
    }
}
