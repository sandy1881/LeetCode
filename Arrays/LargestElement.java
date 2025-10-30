package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {999,100,238,1000,2029};
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element is : "+max);
    }
}
