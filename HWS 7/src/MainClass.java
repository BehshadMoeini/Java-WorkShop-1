
import java.util.Scanner;


public class MainClass {

    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner scan = new Scanner(System.in);
        String flag;
        do {
            showMenu();
            flag = scan.next();
            if(flag.equals("7")){
                break;
            }
            switch (flag) {
                case "1":
                    admin.printListOfLandForSale();
                    break;
                case "2":
                    admin.printListOfUnitForSale();
                    break;
                case "3":
                    admin.addNewEstateToList();
                    break;
                case "4":
                    System.out.print("Enter name Of Owner without space: ");
                    admin.editInformationOfOwner(scan.next());
                    break;
                case "5":
                    System.out.print("Enter name Of Owner without space: ");
                    admin.removeEstateFromList(scan.next());
                    break;
                case "6":
                    admin.printList();
                    break;
                default:
                    System.err.println("in Valid!");
            }
        } while (true);
    }

    private static void showMenu() {
        System.out.println("----------****-------------");
        System.out.println("1.print list of Lands");
        System.out.println("2.print list of Units");
        System.out.println("3.add new Estate");
        System.out.println("4.edit Inforamtion of Estate");
        System.out.println("5.Remove Estate from List");
        System.out.println("6.print List of EStates");
        System.out.println("7.exit");
        System.out.println("----------****-------------");
        System.out.print("choose one option: ");
    }
}
