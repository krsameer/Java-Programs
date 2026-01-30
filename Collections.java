//Using ArrayList HashSet and HashMap in once program
import java.util.*;

public class Collections{
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("ArrayList stored values are: " + fruits);

        HashMap<String, Integer> fruitsnumber=new HashMap<>();
        fruitsnumber.put("Mango",32);
        fruitsnumber.put("Banana",2);
        fruitsnumber.put("Pineapple",8);
        System.out.println("Hashmap" + fruitsnumber);

        HashSet<String> uniquefruits=new HashSet<>();
        uniquefruits.add("Mango");
        uniquefruits.add("Banana");
        uniquefruits.add("Mango");
        uniquefruits.add("Pineapple");
        System.out.println("Hashset" + uniquefruits);

    }
}