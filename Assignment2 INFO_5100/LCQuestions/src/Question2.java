public class Question2 {
    public static void main(String args[]) {
        String[] input = {"practice", "makes", "perfect", "coding", "makes"};
        String s = "coding";
        String t = "practice";
        System.out.print(shortestDist(input, s, t));
    }

    public static int shortestDist(String[] words, String word1, String word2) {
        int w1 = -1;
        int w2 = -1;
        int temp = words.length;
        for (int i = 0; i < temp; i++) {
            String s = words[i];
            if (word1.equals(s)) {
                w1 = i;
            } else if (word2.equals(s)) {
                w2 = i;
            }
            if (w1 >= 0 && w2 >= 0) {
                temp = Math.min(temp, Math.abs(w1 - w2));
            }
        }
        return temp;
    }
}
