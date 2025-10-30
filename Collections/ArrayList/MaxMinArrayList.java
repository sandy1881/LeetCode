package Collections.ArrayList;

import java.util.*;

public class MaxMinArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,5,23,47,64,90));
        int max = Collections.max(arr);
       int min =  Collections.min(arr);
       System.out.println(max);
       System.out.println(min);


       int nmax = Integer.MIN_VALUE;
       int nmin = Integer.MAX_VALUE;
       for(int i=0;i<arr.size();i++){
        if(arr.get(i)>nmax){
            nmax = arr.get(i);
        }
        if(arr.get(i)<nmin){
            nmin = arr.get(i);
        }
       }
       System.out.println(nmax);
       System.out.println(nmin);
    }
}
