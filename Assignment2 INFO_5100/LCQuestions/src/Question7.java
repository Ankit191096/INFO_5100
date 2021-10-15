public class Question7 {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        StringBuffer sb = new StringBuffer();
        int end1 = num1.length()-1;
        int end2 = num2.length()-1;
        int carry = 0;
        int sum = 0;
        int maxLength = num1.length()>=num2.length()?num1.length():num2.length();

        while(maxLength > 0){
            if(end1 >= 0){
                sum = sum + num1.charAt(end1--)-'0';
            }
            if(end2 >= 0){
                sum = sum + num2.charAt(end2--)-'0';
            }
            sum = sum + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            sum = 0;
            maxLength--;
        }

        if(carry == 1){
            sb.append(1);
        }

        return sb.reverse().toString();
    }
}
