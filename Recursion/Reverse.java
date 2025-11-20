package Recursion;

public class Reverse {
    public static int reverse(int n, int rev){
        if (n==0) return rev;

        return reverse(n/10,rev*10+n%10);
    }
    public static void main(String[] args){
        int n= 1234;
        reverse(n,0);
    }
}
