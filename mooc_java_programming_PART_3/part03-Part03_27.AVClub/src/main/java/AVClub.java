
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        String input = scanner.nextLine();
            if(input.length()==0){
                break;
            }else{
        
        String[] str = input.split(" ");
        
        int len = str.length;
        for(int i = 0;i<len;i++){
            if(str[i].contains("av")){
                System.out.println(str[i]);
            }
        }
            }
        }
    }
}
