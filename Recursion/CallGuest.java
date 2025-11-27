package Recursion;

public class CallGuest {
    public static void main(String[] args) {
        int n = 4;
        int call = callGuest(n);
        System.out.println(call);
    }
    public static int callGuest(int n){
        if(n==0||n==1){
            return 1;
        }
        int call1 = callGuest(n-1);
        int call2 = (n-1)*callGuest(n-2);

        return call1 + call2;
    }   
}
