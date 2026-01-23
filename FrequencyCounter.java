import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter{
    public static Map<String, Integer> countFrequency(String[] array) {

        Map<String, Integer> frequencyMap=new HashMap<>();

        for(String item:array) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item,0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        String[] fruits={"Mango,Apple,Banana,Grape,Orange,Apple,Apple,Banana,Orange,Orange,Orange,Orange"};

        Map<String, Integer> frequency=countFrequency(fruits);

        System.out.print("Frequency of elements:");
        for(Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}