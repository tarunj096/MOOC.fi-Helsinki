
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }else{
                String[] str = input.split(" ");
                int len = str.length;
                System.out.println(str[len-1]);
            }
        }

    }
}
