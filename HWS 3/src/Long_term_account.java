import java.util.*;

public class Long_term_account {
    
    String name;
    long phoneNumber;
    long codemeli;
    int password;
    long balance;
    
    public void submit_information(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Detail : \n");
        System.out.print("Name : ");
        this.name = input.nextLine();
        System.out.print("Phone Number : ");
        this.phoneNumber = input.nextLong();
        System.out.print("Codemeli : ");
        this.codemeli = input.nextLong();
        System.out.print("Password : ");
        this.password = input.nextInt();
        System.out.print("Balance : ");
        this.balance = input.nextLong();
        System.out.println("Your Account was created successfully");
        System.out.println("--------------------------------------------");
    }
    
    public void display_information(){
        System.out.println("Name : "+this.name);
        System.out.println("Phone Number : "+this.phoneNumber);
        System.out.println("Codemeli : "+this.codemeli);
        System.out.println("Password : "+this.password);
        System.out.println("balance : "+this.balance);
    }
    
    public void withdraw(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your withdraw amount : ");
        int s = input.nextInt();
        if((this.balance - s) >= 0){
            this.balance -= s;
            System.out.println("your withdraw was been successfully");
        }
        else{
            System.out.println("your Account balance is not enough");
        }
    }
    
    public void deposit(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your deposit amount : ");
        int s = input.nextInt();
        this.balance += s;
    }
}
