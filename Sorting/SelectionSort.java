package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,1,4,8,2,6,4,7};
         
        for(int i=0;i<arr.length - 1;i++){
            int small = i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[small]>arr[j]){
                small = j;
               }

            }
            int temp = arr[small];
            arr[small] = arr[i];
             arr[i] = temp;
        }
        for(int ele : arr){
        System.out.print(ele+" ");}
    }
    
}
