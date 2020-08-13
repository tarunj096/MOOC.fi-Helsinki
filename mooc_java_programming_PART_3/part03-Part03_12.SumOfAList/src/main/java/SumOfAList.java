
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int si = list.size()-1;
        int sum = 0;
        while(si >=0){
            sum = sum + list.get(si);
            si--;
        }
        System.out.println("Sum: "+sum);

        // toteuta listan lukujen summan laskeminen tänne
    }
}
