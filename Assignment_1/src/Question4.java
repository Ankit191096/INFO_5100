import java.util.HashMap;

public class Question4 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: magazine.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c: ransomNote.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;

            } else if (map.get(c) >0){
                map.put(c, map.get(c)-1);
            } else return false;
        }
        return true;

    }
}
