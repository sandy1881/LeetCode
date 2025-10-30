package Collections.ArrayList;
import java.util.*;

public class Smalest {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(11,2,13,41,55,27,12));
        int max = Integer.MIN_VALUE;
        for(int n:arr){
            if(n>max){
                max= n;
            }
        }
        System.out.println(max);
    }
}
