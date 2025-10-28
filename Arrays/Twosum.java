package Arrays;


public class Twosum{
    public  static int[] twosum(int[] nums ,int target ){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }

        }
        return null;
    }
    public static void main(String[] args) {
        int target = 9;
        int[] nums = {2,7,11,15};    
        int[] result = twosum(nums, target);

        System.out.println("["+ result[0]+ ","+ result[1]+ "]");
    }
}
