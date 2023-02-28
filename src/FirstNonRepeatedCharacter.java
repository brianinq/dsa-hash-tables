import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatedCharacter {
    public static char findFirstChar(String s){
        HashMap<Character, Integer> foundChars = new HashMap<>();

        var chars = s.toCharArray();
        for (char ch: chars){
            var count = foundChars.getOrDefault(ch, 0);
            foundChars.put(ch, count+1);
        }
        for (char ch: chars){
            if(foundChars.get(ch)==1){
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }
    public static char firstRepeatedChar(String s){
        Set<Character> set = new HashSet<>();
        for (char ch: s.toCharArray()){
            if (set.contains(ch))
                return ch;
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
