import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1) open Short-term Account");
        System.out.println("2) open Long-term Account");
        System.out.println("3) Long-term Account Blocking");
        System.out.print("\n Enter your chooze : ");
        int a = input.nextInt();
        System.out.println("--------------------------------------------");
        
        switch(a){
            case 1:
                Short_term_account x1 = new Short_term_account();
                x1.submit_information();
                System.out.println("1) Deposit");
                System.out.println("2) Withdraw");
                System.out.println("3) Display information");
                System.out.print("\n Enter your chooze : ");
                int b = input.nextInt();
                System.out.println("--------------------------------------------");
                if(b == 1) x1.deposit();
                else if(b == 2) x1.withdraw();
                else if(b == 3) x1.display_information();
                else System.out.println("The number entered is incorrect");
                break;
                
                
            case 2:
                Long_term_account x2 = new Long_term_account();
                x2.submit_information();
                System.out.println("1) Deposit");
                System.out.println("2) Withdraw");
                System.out.println("2) Display information");
                System.out.print("\n Enter your chooze : ");
                int c = input.nextInt();
                System.out.println("--------------------------------------------");
                if(c == 1) x2.deposit();
                else if(c == 2) x2.withdraw();
                else if(c == 3) x2.display_information();
                else System.out.println("The number entered is incorrect");
                break;
                
                
            case 3:
                Block x3 = new Block();
                x3.blocking();
                break;
                
            default:
                System.out.println("The number entered is incorrect");
        }
    }
    
}
