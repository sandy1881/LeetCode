package Recursion;

public class RemoveDuplicates {
    public static boolean [] map = new boolean[26];
    public static void remove(String src,int idx,String newstr){
        if(idx == src.length()){
            System.out.println(newstr);
            return;
 }
            char currChar = src.charAt(idx);
            if(map[currChar -'a'] == true){
                remove(src, idx+1, newstr);
            }else{
                newstr +=currChar;
                map[currChar-'a'] = true;
               remove(src, idx+1, newstr); 
            }
       
    }
    public static void main(String[] args) {
        String src = "abaabbscdasdf";
        remove(src,0,"");
    }
}
