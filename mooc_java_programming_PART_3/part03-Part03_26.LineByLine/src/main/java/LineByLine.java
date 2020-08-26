
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String text = scanner.nextLine();
            String[] arr = text.split(" ");
            if(text.length() == 0){
                break;
            }else{
                for(int i = 0;i<arr.length;i++){
                    System.out.println(arr[i]);
                }
            }
            
        }


    }
}
