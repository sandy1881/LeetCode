 //An Array in java is a collection of elements,
 //all of the same type.
//  stored in contiguoes memory
// ex int[] arr = {1,2,3,4,5};

// Declaration -> int[] arr or int arr[]
// creation -> arr = new int[5];
// Initialization ->  arr[0]=1;
//                    arr[1]=2;
// Accessing -> use indexing (starts at 0)
// Iterating ->  for(int ar : arr){System.out.println(ar);}
// Array length -> arr.length;
// multidimentional array ->  int[][] matrix = {{1,2,3},{5,6,7}}

package Arrays.Arrays;

public class Arrays_Theory {
    public static void main(String []args){
     int[] arr = {1,2,3,4,5};
     int sum =0;

     for(int ar : arr){
        sum += ar;
     }
     double average = (double) sum/arr.length;

     System.out.println("Sum : "+sum);
     System.out.println("Average : "+average);
    }   
}
