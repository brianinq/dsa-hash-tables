import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String>  map = new HashMap<>();
        map.put(1, "Brian");
        map.put(2, "Coding");
        map.put(3, "Coding");
        map.put(null, null);
        map.remove("test");
        map.get(2);
        map.containsKey(1); // runs in O(1)
        map.containsValue("Brian"); // O(n)
        System.out.println(map);

        for (var key: map.keySet()){
            System.out.println(map.get(key));
        }
        for (var item: map.entrySet()){
            System.out.println(item.getValue());
        }


        System.out.println(FirstNonRepeatedCharacter.findFirstChar("hello world!"));
        System.out.println(FirstNonRepeatedCharacter.findFirstChar("!!"));
        System.out.println(FirstNonRepeatedCharacter.firstRepeatedChar("hello world!"));


        HashTable table = new HashTable();
        table.put(6, "Hello World");
        table.put(6, "Kotlin");
        table.put(8, "Javac");
        table.put(11, "JVM");
        table.remove(8);
        System.out.println(table.get(6));
    }
}