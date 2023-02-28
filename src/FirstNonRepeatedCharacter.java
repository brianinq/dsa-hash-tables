import java.util.HashMap;

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
}
