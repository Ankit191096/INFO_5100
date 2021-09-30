public class Question5 {

    public static boolean toCheck(String numChar) {
        boolean isDigit = false;
        boolean isLetter = false;
        char ch = ' ';
        ch = numChar.charAt(0);
        if(Character.isDigit(ch)){
            isDigit = true;
        }else{
            isLetter = true;
        }
        for(int i = 1; i<numChar.length(); i++){
            ch = numChar.charAt(i);
           if(isLetter){
               if(Character.isLetter(ch)){
                   return false;
               }else{
                   isDigit = true;
                   isLetter = false;
               }
           }else if(isDigit){
               if(Character.isDigit(ch)){
                   return false;
               }else{
                   isDigit = false;
                   isLetter = true;
               }
           }
        }
        return true;
    }

    public static void main(String[] args) {
        String numChar = "1A3d4s5t";
        if(toCheck(numChar)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
