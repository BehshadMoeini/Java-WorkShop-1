import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        final int p = 10;
        Scanner input = new Scanner(System.in);
        Information<String,String,String,String> inf = new Information<String,String,String,String>();
        
        inf.firstName = new String[p];
        inf.lastName = new String[p];
        inf.nationalNumber = new String[p];
        inf.level = new String[p];
        
        inf.getDetail();
        
        List<String> firstNameList = new ArrayList<String>();
        List<String> lastNameList = new ArrayList<String>();
        List<String> nationalNumberList = new ArrayList<String>();
        List<Integer> levelList = new ArrayList<Integer>();
        
        int level[] = new int[p];
        for(int i=0; i<p; i++){
            level[i] = Integer.parseInt(inf.level[i]);
        }
        
        for(int i=0; i<p; i++){
            firstNameList.add(inf.firstName[i]);
            lastNameList.add(inf.lastName[i]);
            nationalNumberList.add(inf.nationalNumber[i]);
            levelList.add(level[i]);
        }
        
        System.out.println("\n-------------------------------------------------");
        
        Services ser = new Services();
        ser.first_service(firstNameList,lastNameList,nationalNumberList,levelList);
        ser.second_service(levelList,firstNameList,lastNameList);
    }
    
}
