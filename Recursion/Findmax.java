package Recursion;

public class Findmax {
    public static int maxele(int[] arr, int i) {
        if (i==arr.length-1) return arr[i]; 
        return Math.max(arr[i],maxele(arr,i+1));

    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,9,6,8,7};
        int i=0;
        System.out.println(maxele(arr,i));
    }
    
}
