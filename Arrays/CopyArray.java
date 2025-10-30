package Arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] original = {1,3,2,6,4,8,7};
        int[] copy = new int[original.length];

        for(int i=0;i<original.length;i++){
            copy[i]=original[i];
        }
        Arrays.sort(copy);
        for(int cop: copy){
            System.out.print(cop +" ");
        }
    }
}
