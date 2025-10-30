package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraysum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,4,5,6,7));
        int sum = 0;
        for(int num:arr){
            sum += num;
        }
        System.out.println(sum);
    }
}
