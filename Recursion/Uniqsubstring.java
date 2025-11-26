package Recursion;

import java.util.HashSet;

public class Uniqsubstring {
    


    public static void subsequence(String str,int idx,String newstr,HashSet<String> set){
        if(idx == str.length()){
            if(!set.contains(newstr)){
                System.out.println(newstr);
                set.add(newstr);
            }
            return;
        }
        char currChar = str.charAt(idx);
        subsequence(str, idx+1, newstr+currChar,set);
        subsequence(str, idx+1, newstr,set);
    }
    public static void main(String[] args) {
      String str = "abc";
      HashSet<String> set = new HashSet<>();
      subsequence(str,0,"",set);  
    }
}
