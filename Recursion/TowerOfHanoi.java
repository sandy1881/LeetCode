package Recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println(n);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println(n);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 7;
        towerOfHanoi(n,"s","h","d");
    }
    
}
