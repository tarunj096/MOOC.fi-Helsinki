
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }else{
                String[] str = input.split(",");
                int teg = Integer.valueOf(str[1]);
                if(teg > max){
                    max = teg;
                }
            }
        }
        System.out.println("Age of the oldest: "+max);
    }
}
