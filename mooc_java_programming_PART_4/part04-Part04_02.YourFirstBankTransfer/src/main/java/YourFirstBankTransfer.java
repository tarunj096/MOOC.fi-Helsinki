
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account newMat = new Account("Matthews account",1000);
        Account newMato = new Account("My account",0);
        /*System.out.println("Initial state");
        System.out.println(newMat);
        System.out.println(newMato);*/
        
        newMat.withdrawal(100);
        newMato.deposit(100);
        System.out.println("The balance of Arto's account is now: " + newMat);
        System.out.println("The balance of Arto's account is now: " + newMato);
        
        

        


    }
}
