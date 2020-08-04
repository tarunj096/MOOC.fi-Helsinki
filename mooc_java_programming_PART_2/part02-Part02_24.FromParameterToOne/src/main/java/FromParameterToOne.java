

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }


    public static void printFromNumberToOne(int numOfTimes) {
        int i = numOfTimes;
        while(i>0) {
            System.out.println(i);
            i--;
        }
    }

}
