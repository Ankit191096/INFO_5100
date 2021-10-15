public class Question8 {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i <= j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));
            if (a != b) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
