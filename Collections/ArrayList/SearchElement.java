package Collections.ArrayList;
import java.util.*;
public class SearchElement {
    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,41,92,6,33,89,25));
       int search = 25;
       boolean found= false;
       for(int n : arr){
        if (n==search){
            found = true;
        }
        
       }
       if(found== true){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }

        String[] str = {"Hassan","Banglore","Chikmaglur"};
        ArrayList<String> cities = new ArrayList<>(List.of(str));
        String searchstr = "Hassan";
        if(cities.contains(searchstr)){
            System.out.println("City found");
        }else{
            System.out.println("City not found");
        }
    }
}
