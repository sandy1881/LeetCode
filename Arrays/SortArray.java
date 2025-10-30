package Arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] nums= {4,8,13,1,6,2,19,6};
        Arrays.sort(nums);
        for(int num :nums){
            System.out.print(num + " ");
        }
    }
}
