package Collections.HashMap;

import java.util.*;
public class Create {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        System.out.println(map);


    HashMap<Integer,String> ma = new HashMap<>();
    ma.put(101,"Sandesh");
    ma.put(102,"Kumar");
    System.out.println(map);

    HashMap<String,Integer> marks = new HashMap<>();
    marks.put("Maths",95);
    marks.put("English",88);
    System.out.println(marks.get("Maths")); // 95

        HashMap<String,Integer> mark= new HashMap<>();
        mark.put("Maths",95);
        mark.put("English",88);

System.out.println(marks.get("Maths")); // 95

HashMap<String,Integer> product = new HashMap<>();
product.put("Price",100);
product.put("Price",120); // updated
System.out.println(product); // {Price=120}

HashMap<String,String> maps = new HashMap<>();
maps.put("name","Sandesh");
System.out.println(maps.containsKey("name")); // true

HashMap<String,String> mapp = new HashMap<>();
mapp.put("place","Bangalore");
System.out.println(mapp.containsValue("Bangalore")); // true

map.remove(1);
System.out.println(map); // {2=B}


for(Map.Entry<Integer,String> e : map.entrySet()) {
    System.out.println(e.getKey()+" -> "+e.getValue());}

    HashMap<String,Integer> maped = new HashMap<>();
maped.put("Apple",10);
maped.put("Banana",20);

System.out.println(maped.keySet());
System.out.println(map.values());
    }
}
