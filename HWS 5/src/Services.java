import java.util.Collections;
import java.util.List;

public class Services {
    
    final int p = 10;
    
    public void first_service(List<String> firstName_list,List<String> lastName_list,List<String> nationalNumber_list,
            List<Integer> level_list){
        
        for(int i=0; i<p; i++){
            System.out.println("\nParticipant (" + (i+1) + ")");
            System.out.println("First Name : " + firstName_list.get(i));
            System.out.println("Last Name : " + lastName_list.get(i));
            System.out.println("National Number : " + nationalNumber_list.get(i));
            System.out.println("Level : " + level_list.get(i));
        }
        
        int sum = 0 , j = 0;
        
        for(int i=0; i<p; i++){
            sum += level_list.get(i);
            j++;
        }
        
        float average = sum / j;
        
        System.out.println("\nAverage level of total participants : " + average);
        System.out.println("\n---------------------------------------------------");
    }
    
    
    public void second_service(List<Integer> level_list, List<String> firstName_list, List<String> lastName_list){
        int max = level_list.get(0);
        
        for(int i=0; i<p; i++){
            
            if(level_list.get(i) > max){
                max = level_list.get(i);
            }
        }
        
        int level[] = new int[p];
        for(int i=0; i<p; i++){
            level[i] = level_list.get(i);
        }
        
        System.out.println("\nRanking of participants : ");
        Collections.sort(level_list);
        int k = p-1;
        for(int i=0; i<p; i++){
            for(int j=0; j<p; j++){
                if(level[j] == level_list.get(k)){
                    System.out.println("\nNumber (" + (i+1) + ")");
                    System.out.println("First Name : " + firstName_list.get(j));
                    System.out.println("Last Name : " + lastName_list.get(j));
                    System.out.println("Level : " + level[j]);
                    break;
                }
            }
            k--;
        }
    }
    
}
