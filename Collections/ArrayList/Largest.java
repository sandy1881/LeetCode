package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Largest {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,4,28,36,42));
       int min = Integer.MAX_VALUE;
       for(int num :arr){
        if(num<min){
            min = num;
        }
       } 
       System.out.println(min);
    }
}
