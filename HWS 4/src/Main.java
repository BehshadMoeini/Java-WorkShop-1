import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("1) library information");
        System.out.println("2) National card registration");
        System.out.println("3) Get a book");
        System.out.print("\nEnter your select : ");
        int a = input.nextInt();
        
        switch(a){
            case 1:
                Rules information = new Rules();
                information.inscribe_information();
                break;
            
            case 2:
                Rules national_card = new Rules();
                national_card.receive_card();
                break;
                
            case 3:
                Rules lending = new Rules();
                lending.lending_book();
                break;
                
            default :
                System.out.println("The number entered is incorrect");
               
        }
        
        
    }
    
}
