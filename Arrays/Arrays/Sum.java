package Arrays.Arrays;

public class Sum {
    public static void main(String [] args){
        int[] marks = {98,97,94,95,87};
        int sum = 0;

        for(int mark:marks){
            sum += mark; 
            System.out.println(mark);
        }
        System.out.println("Sum is : "+sum);
    }
    
}
