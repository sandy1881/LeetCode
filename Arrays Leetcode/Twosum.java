import java.util.HashMap;
import java.util.Map;

public class Twosum{
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];

            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }

        

        return new int[]{};
    }
    public static void main(String[] args){
        int[] nums= {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("["+ result[0] + ","+result[1]+"]");
    }
}