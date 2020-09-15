
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int maxlen = 0;
        String s = "";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }else{
                String[] str = input.split(",");
                int teg = Integer.valueOf(str[1]);
                sum = sum + teg;
                count++;
                String s1 = str[0];
                if(s1.length()>maxlen){
                    maxlen = s1.length();
                    s = s1;
                }
                
            }
        }
        double avg = (double)sum/count;
        System.out.println("Longest name: "+s);
        System.out.println("Average of the birth years: "+ avg);

    }
}
