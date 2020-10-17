
public class Statistics {
    private int count;
    private int sum;
   // private int average;
   // private int sumEv;
    //private int sumOd;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum =0;
        //this.average = 0;
       // this.sumEv = 0;
        //this.sumOd =0;
    }

    public void addNumber(int number) {
        // write code here
        this.count = this.count +1;
        this.sum = this.sum + number;
       /* if(number%2==0){
            this.sumEv = number + this.sumEv;
        }else if(number%2!=0){
            this.sumOd = number + this.sumOd;
        }*/
    }

    public int getCount() {
        // write code here
        return this.count;
    }
    public int sum() {
        // write code here
        return this.sum;
    }
     //public int sumEven() {
        // write code here
       // return sumEv;
    //}
      //public int sumOdd() {
        // write code here
        //return sumOd;
    //}

    public double average() {
        // write code here
        double average = 0;
       if (count==0){
           return average;
       }
       average =(double)sum/(double)count ;
       return average;
    }
}
