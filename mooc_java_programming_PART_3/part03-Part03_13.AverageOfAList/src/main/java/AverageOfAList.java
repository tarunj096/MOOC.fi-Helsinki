
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num==-1){
                break;
            }
            list.add(num);
        }
        int num1 = list.size();
        int si = list.size()-1;
        int sum = 0;
        while(si >=0){
            sum = sum + list.get(si);
            si--;
        }
        float avg = (float)sum/num1;
        System.out.println("Average: "+avg);
    }
}
