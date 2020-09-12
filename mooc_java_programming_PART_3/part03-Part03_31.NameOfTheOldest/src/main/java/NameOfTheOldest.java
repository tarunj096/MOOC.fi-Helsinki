
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int max = 0;
            String str1 =""; 
            while(true){
                String input = scanner.nextLine();
                if(input.equals("")){
                    break;
                }else{
                    String[] str = input.split(",");
                    int teg = Integer.valueOf(str[1]);
                    if(teg > max){
                        max = teg;
                        str1 = str[0];
                    }
                }
            }
            System.out.println("Name of the oldest: "+str1);

        }
    }
