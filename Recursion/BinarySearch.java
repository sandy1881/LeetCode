package Recursion;

public class BinarySearch {

    public static int binarysearch(int[] arr, int l,int r,int target){
        if(l>r) return -1;
        int mid = (l+r)/2;
        if(arr[mid]== target) return mid;
        if(target<arr[mid]) return binarysearch(arr, l, mid-1, target);
        return binarysearch(arr, mid+1, r, target);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 7;
        int l= arr[0];
        int r = arr.length-1;
        System.out.println(binarysearch(arr, l,r,target));
    }
}
