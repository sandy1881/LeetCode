package Arrays.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int ele =1;
        boolean found = false;
        for(int num:nums){
            if(num == ele){
               found = true;
                break;
            }else{
                found = false;
            }
        }
        if(found == true) {System.out.println("Element Found");}
        else{System.out.println("Element Not Found");}
    }
}
