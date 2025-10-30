package Collections.ArrayList;
import java.util.*;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(23,12,3,56,4,19));
        // Collections.sort(arr);
        // System.out.println(arr);

        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<=arr.size()-1;j++){
                int swap;
                if(arr.get(i)>arr.get(j)){
                   swap=arr.get(i); 
                   arr.set(i,arr.get(j));
                   arr.set(j,swap);
                }
            }
            
        }
        System.out.println(arr);
    }
}
