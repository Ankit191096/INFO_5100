import java.util.HashMap;

public class Question6 {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s , t));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap< Character, Character > mymap = new HashMap< Character, Character >();
        boolean res = true;
        for(int i = 0; i < s.length(); i++){
            char schar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!mymap.containsKey(schar)){
                if(mymap.values().contains(tChar)){
                    return false;
                }
                mymap.put(schar,tChar);
            } else {
                if(tChar != mymap.get(schar)){
                    return false;
                }
            }
        }
        return res;
    }
}
