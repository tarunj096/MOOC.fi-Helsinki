
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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

        System.out.println("");
        int n =list.size() - 1;
        // implement here finding the indices of a number
        System.out.print("Search for? ");
        int search = Integer.valueOf(scanner.nextLine());
        while(n>= 0){
            if(list.get(n) == search){
                System.out.println(search +" is at index "+ n);
            }
            n--;
        }
    }
}
