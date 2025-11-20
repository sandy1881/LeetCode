package Recursion;
public class Recursion {
    public static void printing(int num){
        if(num==0) return;

        System.out.print(num+" ");
        printing(num-1);

    }

    public static void main(String[] args) {
        int num = 5;
        printing(num);
    }
    
}
