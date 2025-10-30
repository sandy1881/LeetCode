package Collections.ArrayList;

import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
                          fruits.add("Apple");
                          fruits.add("butterfruit");
                          fruits.add("banana");
                          fruits.add("Mango");

    System.out.println(fruits);
    System.out.println(fruits.get(0)); 
    System.out.println(fruits.get(3));
    fruits.set(1,"strawberry");
    System.out.println(fruits);
    fruits.remove(1);
    System.out.println(fruits);
    fruits.remove("Apple");
    System.out.println(fruits);
    System.out.println(fruits.size());
    System.out.println(fruits.contains("banana"));
    System.out.println(fruits.isEmpty());
    fruits.clear();
    System.out.println(fruits);

    }
}
