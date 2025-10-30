package Collections.ArrayList;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,56,7,8));
        ArrayList<Integer> reverse = new ArrayList<>();
        ArrayList<Integer> colreverse = new ArrayList<>();
        for(int i =arr.size()-1;i>=0;i--){

            reverse.add(arr.get(i));
        }
        Collections.reverse(arr);
        System.out.println(arr);
        System.out.println(reverse);
    }
}
