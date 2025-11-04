package Collections.HashSet;

import java.util.HashSet;

public class Hashset {
     public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        System.out.println(set);

        HashSet<Integer> sets = new HashSet<>();
sets.add(10);
sets.add(20);
sets.add(30);
System.out.println(sets);
System.out.println(set.contains(10)); // true

sets.remove(10);
System.out.println(sets.size());

for(String s : set){
    System.out.println(s);
}
System.out.println(set.isEmpty());
sets.clear(); 
    }
   
}
