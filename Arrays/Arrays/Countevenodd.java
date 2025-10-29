package Arrays.Arrays;

public class Countevenodd {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,56,12,13,46,37,91};
        int odd = 0;
        int even =0;

        for(int num:nums){
            if(num%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Odd count: "+odd);
        System.out.println("Even count : "+even);
    }
}
