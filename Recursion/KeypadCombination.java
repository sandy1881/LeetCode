package Recursion;

public class KeypadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        String str = "23";
        String combination = "";
        keypadComb(str,0,combination);
    }

    public static void keypadComb(String str,int idx,String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            keypadComb(str, idx+1, combination + mapping.charAt(i));
        }
    }
}
