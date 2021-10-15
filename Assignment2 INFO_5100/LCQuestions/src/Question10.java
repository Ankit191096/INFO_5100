public class Question10 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        compress(chars);
    }

    public static void compress(char[] chars) {
        int slow = 0;
        int fast = 0;
        int n = chars.length;
        int length;
        while(fast < n){
            chars[slow] = chars[fast];
            length = 1;
            while(fast < n-1 && chars[fast] == chars[fast+1]) {
                fast++;
                length++;
            }
            slow++;
            if(length > 1) {
                int start = slow;
                while(length != 0)    {
                    chars[slow++] = (char)(length % 10+'0');
                    length /= 10;
                }
                int end = slow-1;
                while(start < end) {
                    char temp = chars[start];
                    chars[start] = chars[end];
                    chars[end] = temp;
                    start++;
                    end--;
                }
            }
            fast++;
        }
        System.out.println(slow);
        for(int i = 0; i < slow; i++){
            System.out.print(chars[i]);
        }
    }
}
