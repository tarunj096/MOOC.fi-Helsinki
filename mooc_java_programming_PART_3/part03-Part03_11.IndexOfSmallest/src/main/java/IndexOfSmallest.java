
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList();
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if ( num == 9999){
                break;
            }
            list.add(num);
        }
        int small = list.get(0);
        int index = 0;
        int i = list.size() - 1;
        
        while(i >= 0){
            int j = list.get(i);
            if (j <= small){
                small = j;
                index = i;
            }
           i--;     
        }
        System.out.println("Smallest number: "+small);
        System.out.println("Found at index: "+ index);
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
