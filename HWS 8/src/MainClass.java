import java.util.Scanner;

public class MainClass {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Manager admin = new Manager();
        String flag;
        do {
            showMenu();
            flag = scan.next();
            if (flag.equals("4")) {
                break;
            }
            switch (flag) {
                case "1":
                    showMenuOfTypes();
                    break;
                case "2":
                    admin.addCommodity();
                    break;
                case "3":
                    admin.showGoods();
                    break;
                default:
                    System.err.println("in Valid!");
            }
        } while (true);
    }

    public static void showMenu() {
        System.out.println("----------****-------------");
        System.out.println("1.show Types");
        System.out.println("2.Add Goods");
        System.out.println("3.show Goods");
        System.out.println("4.exit");
        System.out.println("----------****-------------");
        System.out.print("choose one option: ");
    }

    public static void showTypes() {
        System.out.println("----------****-------------");
        System.out.println("1.Digital Goods");
        System.out.println("2.Fashion And Clothing");
        System.out.println("3.Home And Kitchen");
        System.out.println("4.Books");
        System.out.println("5.exit");
        System.out.println("----------****-------------");
        System.out.print("choose one option: ");
    }

    public static void showDigitalGoods() {
        System.out.println("----------****-------------");
        System.out.println("1.Mobile");
        System.out.println("2.Computer And LapTop");
        System.out.println("3.Camera");
        System.out.println("4.Headphone");
    }

    public static void showFashionAndClothing() {
        System.out.println("----------****-------------");
        System.out.println("1.MenSwear");
        System.out.println("2.Women's Dress");
        System.out.println("3.Children's Clothing");
        System.out.println("4.Shoe");
    }

    public static void showHomeAndKitchen() {
        System.out.println("----------****-------------");
        System.out.println("1.Home Appliancess");
        System.out.println("2.Decoration");
        System.out.println("3.Multimedia");
        System.out.println("4.Kitchen");
    }

    public static void showBook() {
        System.out.println("----------****-------------");
        System.out.println("1.Foreign Books");
        System.out.println("2.Internal Books");
        System.out.println("3.Computer Books");
        System.out.println("4.Story Books");
    }

    public static void showMenuOfTypes() {
        String flag1;
        do {
            showTypes();
            flag1 = scan.next();
            if (flag1.equals("5")) {
                break;
            }
            switch (flag1) {
                case "1":
                    showDigitalGoods();
                    break;
                case "2":
                    showFashionAndClothing();
                    break;
                case "3":
                    showHomeAndKitchen();
                    break;
                case "4":
                    showBook();
                    break;
                default:
                    System.err.println("in Valid!");
            }
        } while (true);
    }
}
