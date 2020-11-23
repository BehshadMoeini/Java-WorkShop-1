import java.util.*;

public class Admin {
    
    ArrayList<Estate> estateList = new ArrayList<Estate>();
    
    Scanner scan = new Scanner(System.in);

    public void printListOfLandForSale() {
        System.out.println("\nList Of Land For Sale:");
        for (Estate landCounter : estateList) {
            if (landCounter.getType().equals("land")) {
                System.out.println(landCounter.toString());
            }
        }
    }

    public void printListOfUnitForSale() {
        System.out.println("\nList Of Unit For Sale:");
        for (Estate unitCounter : estateList) {
            if (unitCounter.getType().equals("unit")) {
                System.out.println(unitCounter.toString());
            }
        }
    }

    public void printList() {
        System.out.println("\nList Of Estates For Sale:");
        for (Estate unitCounter : estateList) {
            System.out.println(unitCounter.toString());
        }
    }

    public void addNewEstateToList() {
        Estate estate = new Estate();
            System.out.print("Enter full name of Owner without space: ");
            estate.setName(scan.next());
            
            System.out.print("Enter National Code of Owner: ");
            String code = scan.next();
            estate.setNationalCode(code);

            System.out.print("Enter Phone Number of Owner: ");
            estate.setPhoneNumber(scan.next());

            System.out.print("Enter Width of land: ");
            estate.setWidth(scan.nextDouble());

            System.out.print("Enter length of land: ");
            estate.setLength(scan.nextDouble());

            System.out.print("Enter Address of land: ");
            estate.setAddress(scan.next());

            System.out.print("Enter Price of land: ");
            estate.setPrice(scan.nextDouble());

            System.out.print("Enter Type of land(unit/land): ");
            estate.setType(scan.next());
            estateList.add(estate);
            System.out.printf("%s Added.%n",estate.getType());
    }

    public void removeEstateFromList(String ownername) {
        boolean flag = false;
        for (Estate estate:estateList) {
            if(estate.getName().equals(ownername)){
                estateList.remove(estate);
                flag=true;
                System.out.println("Estate Removed");
                break;
            }
        }
        if (!flag) {
            System.err.println(ownername + " Not Have Any Land in List!");
        }
    }

    public void editInformationOfOwner(String ownername) {
        boolean flag = false;
        for (Estate EstateCounter : estateList) {
            if (EstateCounter.getName().equals(ownername)) {

                System.out.print("Enter full name of Owner whithout space: ");
                EstateCounter.setName(scan.next());

                System.out.print("Enter National Code of Owner: ");
                EstateCounter.setNationalCode(scan.next());

                System.out.print("Enter Phone Number of Owner: ");
                EstateCounter.setPhoneNumber(scan.next());

                System.out.print("Enter Width of land: ");
                EstateCounter.setWidth(scan.nextDouble());

                System.out.print("Enter length of land: ");
                EstateCounter.setLength(scan.nextDouble());

                System.out.print("Enter Address of land: ");
                EstateCounter.setAddress(scan.next());

                System.out.print("Enter Price of land: ");
                EstateCounter.setPrice(scan.nextDouble());

                System.out.print("Enter Type of land(unit/land): ");
                EstateCounter.setType(scan.next());

                flag = true;
                System.err.println("Owner Information Edited!");
                break;
            }
        }
        if (!flag) {
            System.err.println(ownername + " Not Have Any Estate in List!");
        }
    }
}