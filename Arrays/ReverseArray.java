package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // correct order
         System.out.println("Correct Order");
        for(int n:arr){
            System.out.print(n +" ");
            
        }
        System.out.println();
        //Reverse Order
        System.out.println("Reverse Order");
        for(int i=arr.length-1;i>=0;i--){
            
            System.out.print(arr[i]+" ");
        }
    }
}
