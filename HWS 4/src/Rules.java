import java.util.*;

public class Rules {
    String[][] book = new String[1][10];
    int[][] book_code = new int[1][10];
    
    public Rules(){
        this.book[0][0] = "the power of habit (11)";
        this.book_code[0][0] = 11;
        this.book[0][1] = "the compound effect (22)";
        this.book_code[0][1] = 22;
        this.book[0][2] = "Harry Potter (33)";
        this.book_code[0][2] = 33;
        this.book[0][3] = "Think and Grow Rich (44)";
        this.book_code[0][3] = 44;
        this.book[0][4] = "The Lord Of The Rings (55)";
        this.book_code[0][4] = 55;
        this.book[0][5] = "Le petit prince (66)";
        this.book_code[0][5] = 66;
        this.book[0][6] = "O Alquimista (77)";
        this.book_code[0][6] = 77;
        this.book[0][7] = "Il Nome della Rosa (88)";
        this.book_code[0][7] = 88;
        this.book[0][8] = "The Stranger (99)";
        this.book_code[0][8] = 99;
        this.book[0][9] = "The Wright Brothers (101)";
        this.book_code[0][9] = 101;
    }
    
    
        
    public void lending_book(){
        for(int i=0,j=1; i<10; i++,j++){
            System.out.print("\n"+j+") "+book[0][i]);
        }
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("\n\nEnter your name : ");
        String name = input.nextLine();
        System.out.print("Enter your national code : ");
        String national_code = input.nextLine();
        System.out.print("Enter your father name : ");
        String father_name = input.nextLine();
        System.out.print("Enter your book code : ");
        int book_code = input.nextInt();
        
        int temp = 0;
        for(int i=0; i<10; i++){
            if(this.book_code[0][i] == book_code){
                System.out.println("\n**Your operation was successful**");
                temp = 1;
                break;
            }
        }
        
        if(temp == 0){
            System.out.println("\nThe code you entered is incorrect");
        }
    }
    
    
    
    public void receive_card(){
        System.out.println("\nYour national card has been successfully registered");
    }
    
    
    
    public void inscribe_information(){
        final String file_number = "12345";
        final String city = "tehran";
        final String phone_number = "01010101";
        final String zip_code  = "221133";
        final String library_area = "1000";
        final String numbers_of_books = "10";
        final String numbers_of_chairs = "50";
        final String numbers_of_employees = "5";
        
        System.out.println("\n\t**Library information**\n");
        System.out.println("file number          = "+file_number);
        System.out.println("city                 = "+city);
        System.out.println("phone number         = "+phone_number);
        System.out.println("zip code             = "+zip_code);
        System.out.println("library area         = "+library_area);
        System.out.println("numbers of books     = "+numbers_of_books);
        System.out.println("numbers of chairs    = "+numbers_of_chairs);
        System.out.println("numbers of employees = "+numbers_of_employees);
    }
    
 
}
