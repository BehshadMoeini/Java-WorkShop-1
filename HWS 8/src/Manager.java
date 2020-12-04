import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    ArrayList<Commodity> commodityList = new ArrayList<Commodity>();
    static Scanner scan = new Scanner(System.in);

    public void addCommodity() {
        Commodity goods = new Commodity();
        System.out.print("Enter name Of Goods: ");
        goods.setName(scan.next());
        System.out.print("Enter Type Of Goods: ");
        goods.setType(scan.next());
        System.out.print("Enter Price Of Goods: ");
        goods.setPrice(scan.next());
        commodityList.add(goods);
        System.out.println("Good Added.");
    }

    public void showGoods() {
        boolean flag = false;
        for (Commodity good : commodityList) {
            flag = true;
            System.out.println(good.toString());
        }
        if(!flag){
           System.err.println("No Goods");
        }
    }
}
