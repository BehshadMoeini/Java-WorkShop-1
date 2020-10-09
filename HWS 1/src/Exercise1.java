import java.util.*;

public class Exercise1 {

    public static void main(String[] args) {
        
        int n,space,star;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle : ");
        n = input.nextInt();
        space = n-1;
        
        for(int i=1; i<=n; i++)
        {
            for(int j=0; j<space; j++)
            {
                System.out.print(" ");
            }
            
            for(int k=0; k<(2*i)-1; k++)
            {
                System.out.print("*");
            }
            
            System.out.print("\n");
            space 6--;
        }
    }
    
}
