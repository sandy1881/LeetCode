package Recursion;

public class TilesPlacement {
    public static void main(String[] args) {
        int n = 3;
        int m=3;
       int total =  placeTail(n,m);
       System.out.println(total);
    }

    public static int placeTail(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertPlacements = placeTail(n-m,m);
        int horiPlacements = placeTail(n-1,m);
        int  total = vertPlacements+horiPlacements;
        return total;
    }
}
