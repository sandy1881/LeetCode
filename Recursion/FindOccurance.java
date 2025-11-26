package Recursion;

public class FindOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str,int idx,char ele){
        char currElement = str.charAt(idx);

        if(idx == str.length()-1){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(currElement == ele){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurance(str, idx+1, ele);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaaah";
        char element = 'a';
        findOccurance(str,0,element);
    }
}
