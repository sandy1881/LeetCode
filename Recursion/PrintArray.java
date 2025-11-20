package Recursion;

public class PrintArray {

    public static void arrayprint(int[] arr , int i){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        arrayprint(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,9,6,8,7};
        int i=0;
        arrayprint(arr, i);
    }
}
