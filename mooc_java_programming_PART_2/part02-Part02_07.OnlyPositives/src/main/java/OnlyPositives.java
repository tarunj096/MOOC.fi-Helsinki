
import java.util.Scanner;
import java.lang.Math;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0){
                break;
            } else if(num>0){
                System.out.println(num*num);
                continue;
            } else if(num<0){
                System.out.println("Unsuitable number");
            }
            
        }
    }
}
