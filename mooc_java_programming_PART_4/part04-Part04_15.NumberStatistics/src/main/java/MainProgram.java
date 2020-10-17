
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
       // Statistics statistics = new Statistics();
       /* System.out.println("Enter numbers:");
        while(true){
         int num = scanner.nextInt();
         if(num==-1){
             break;
         }
         statistics.addNumber(num);
        }*/
      //  statistics.addNumber(3);
       // statistics.addNumber(5);
        //statistics.addNumber(1);
        //statistics.addNumber(2);

        
       // System.out.println("Count: " + statistics.getCount());
       // System.out.println("Sum: " + statistics.sum());
       // System.out.println("Average: " + statistics.average());
        
       // System.out.println("Sum: " + statistics.sum());
        //System.out.println("Sum: " + statistics.sumEven());
        //System.out.println("Sum: " + statistics.sumOdd());
       // public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //int sumEv =0;
    //int sumOd = 0;
    Statistics statistics = new Statistics();
    Statistics sumEven = new Statistics();
    Statistics sumOdd = new Statistics();
    System.out.println("Enter numbers:");
    while(true){
    int number = sc.nextInt();
    if(number == -1){
        break;
    }
    statistics.addNumber(number);
    if(number%2==0){
        sumEven.addNumber(number);
    }else if(number%2!=0){
        sumOdd.addNumber(number);
    }
    }
    System.out.println("Sum: " + statistics.sum());
    System.out.println("Sum of even numbers:"+sumEven.sum());
    System.out.println("Sum of odd numbers:"+sumOdd.sum());
    
    }
}
