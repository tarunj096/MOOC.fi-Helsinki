
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        int sum1 = number1 + number2 + number3 +number4;
        return sum1;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        int summe = sum(number1,number2,number3,number4);
        float avg = (float)summe/4;
        return avg;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
