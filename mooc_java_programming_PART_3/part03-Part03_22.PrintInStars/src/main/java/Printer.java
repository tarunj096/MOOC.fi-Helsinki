
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for(int i=0;i<array.length;i++){
            int s = 0;
            while(s<array[i]){
                System.out.print("*");
                s++;
            }
            System.out.println();
        }
    }

}
