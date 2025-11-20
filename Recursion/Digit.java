package Recursion;

public class Digit {
    public static int digitt(int digit){
        if(digit == 0) return 0;
        return 1+ digitt(digit/10);
    }    
  public static void main(String[] args) {
    int digit = 9000;
    System.out.println(digitt(digit));
  }  
}
