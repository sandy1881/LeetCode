package Arrays.Arrays;

public class SmalestElement {
    public static void main(String[] args) {
        int[] arr = {12,13,16,1,3,2,18,11};
    int min = arr[0];
    for(int num : arr){
        if(num<min){
            min = num;
        }
    }
    System.out.println("Smalest Element is : "+min);
    }

}
