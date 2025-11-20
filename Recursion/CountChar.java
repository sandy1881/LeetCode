package Recursion;

public class CountChar {
        public static int countChar(String s,char c,int i){
            if(i == s.length()) return 0;
            return (s.charAt(i)==c?1:0)+countChar(s, c, i+1);
        }
    public static void main(String[] args) {
        String s = "Sandesh";
        char c = 'a';
        int i = 0;
        System.out.println(countChar(s,c,i));

    }
}
