package Arrays.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12,34,16,2,17,5,19};
        int largest =Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;

        for (int num: arr){
            if(num>largest){
                second = largest;
                largest=num;  
            }else if(num>second && num!=largest){
                second = num;

            }

        }
        System.out.println("Largest number is : "+largest);
        System.out.println("Second Largest number is : "+second);
    }
}
