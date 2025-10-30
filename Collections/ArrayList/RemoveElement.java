package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,40));
        arr.remove(0);
        arr.remove(2);
        System.out.println(arr);

        String[] strr = {"Sandesh","Sandy","Mysur","Hassan"};
        ArrayList<String> str = new ArrayList<>(Arrays.asList(strr));
        System.out.println(str);
    }
}
