import java.util.*;

public class Information<FIRSTNAME,LASTNAME,NATIONALNUMBER,LEVEL> {
    
    FIRSTNAME[] firstName;
    LASTNAME[] lastName;
    NATIONALNUMBER[] nationalNumber;
    LEVEL[] level;
    final int p = 10;
    public void getDetail(){
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<p; i++){
            System.out.println("\n<Participant " + (i+1) + ">");
            System.out.print("Enter your First Name : ");
            firstName[i] = (FIRSTNAME) input.nextLine();
            
            System.out.print("Enter your Last Name : ");
            lastName[i] = (LASTNAME) input.nextLine();
            
            System.out.print("Enter your National Number : ");
            nationalNumber[i] = (NATIONALNUMBER) input.nextLine();
            
            System.out.print("Enter your Level (0 _ 100) : ");
            level[i] = (LEVEL) input.nextLine();
            
        }
    }
    
}
