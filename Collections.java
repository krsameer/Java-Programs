import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.get(1));
        fruits.set(1, "Grapes");
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.indexOf("Mango"));
        System.out.println(fruits.lastIndexOf("Mango"));
        fruits.remove("Orange");
        fruits.remove(0);
        for (String f : fruits) System.out.println(f);
        Collections.sort(fruits);
        System.out.println(fruits);
        Collections.reverse(fruits);
        System.out.println(fruits);
        ArrayList<String> cloneList = (ArrayList<String>) fruits.clone();
        cloneList.clear();
        System.out.println(cloneList.isEmpty());

        HashSet<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Mango");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple");
        uniqueFruits.add("Mango");
        uniqueFruits.add("Pineapple");
        System.out.println(uniqueFruits);
        System.out.println(uniqueFruits.size());
        System.out.println(uniqueFruits.contains("Banana"));
        uniqueFruits.remove("Apple");
        for (String f : uniqueFruits) System.out.println(f);
        ArrayList<String> setToList = new ArrayList<>(uniqueFruits);
        HashSet<String> tempSet = new HashSet<>(uniqueFruits);
        tempSet.clear();
        System.out.println(tempSet.isEmpty());

        HashMap<String, Integer> fruitCount = new HashMap<>();
        fruitCount.put("Mango", 10);
        fruitCount.put("Banana", 5);
        fruitCount.put("Apple", 8);
        fruitCount.put("Orange", 6);
        fruitCount.put("Mango", 12);
        System.out.println(fruitCount);
        System.out.println(fruitCount.get("Mango"));
        System.out.println(fruitCount.containsKey("Apple"));
        System.out.println(fruitCount.containsValue(6));
        fruitCount.remove("Orange");
        for (Map.Entry<String, Integer> e : fruitCount.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        for (String k : fruitCount.keySet()) System.out.println(k);
        for (Integer v : fruitCount.values()) System.out.println(v);
        fruitCount.replace("Banana", 20);
        System.out.println(fruitCount.getOrDefault("Grapes", 0));
        HashMap<String, Integer> cloneMap = (HashMap<String, Integer>) fruitCount.clone();
        cloneMap.clear();
        System.out.println(cloneMap.isEmpty());

        HashSet<String> listToSet = new HashSet<>(fruits);
        ArrayList<String> setToArrayList = new ArrayList<>(uniqueFruits);

        HashMap<String, ArrayList<String>> categoryMap = new HashMap<>();
        categoryMap.put("Fruits", fruits);
        System.out.println(categoryMap.get("Fruits"));

        fruits.addAll(uniqueFruits);
        fruits.removeAll(uniqueFruits);
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.retainAll(uniqueFruits);
        System.out.println(fruits);
    }
}