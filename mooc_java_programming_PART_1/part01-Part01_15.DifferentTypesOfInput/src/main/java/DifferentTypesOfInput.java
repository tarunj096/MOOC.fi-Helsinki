
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string = scan.nextLine();
        System.out.println("Give an integer:");
        int value = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double value2 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean value3 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string"+" "+string);
        System.out.println("You gave the integer"+" "+value);
        System.out.println("You gave the double"+" "+value2);
        System.out.println("You gave the boolean"+" "+value3);

    }
}
