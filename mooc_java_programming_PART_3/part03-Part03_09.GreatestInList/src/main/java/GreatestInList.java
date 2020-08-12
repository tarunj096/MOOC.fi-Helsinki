
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

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
        
        
        int great = 0;
        int n = list.size() -1 ;
        while(n>=0){
            System.out.println();
            if(list.get(n)>great){
                great = list.get(n);
            }
            n--;
        }
        System.out.println("The greatest number: "+great);
        // implement finding the greatest number in the list here
    }
}
