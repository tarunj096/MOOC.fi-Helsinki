
import java.util.ArrayList;
import java.util.*;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       
        while(true){
                
                System.out.print("First name: ");
                String fName = scanner.nextLine();
                if(fName.isEmpty()){
                    break;
                }
                System.out.print("Last name: ");
                String lName = scanner.nextLine();
                //System.out.println();
                System.out.print("Identification number: ");
                String idNo = scanner.nextLine();
                
                infoCollection.add(new PersonalInformation(fName,lName,idNo));
         
        }
        System.out.println();
        for(PersonalInformation per : infoCollection){
            System.out.println(per.getFirstName()+" "+per.getLastName());
        }

    }
}
