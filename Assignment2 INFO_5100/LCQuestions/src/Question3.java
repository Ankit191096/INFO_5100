public class Question3 {
    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};
        for(int i = 0; i < moveZeroes(array).length; i++){
            System.out.print(moveZeroes(array)[i] + " ");
        }
    }

    public static int[] moveZeroes(int[] array) {
        int temp = 0;
        int n = array.length;
        for(int i = 0; i < n; i++) {
            if(array[i] == 0){
                for(int j = i+1; j < n; j++) {
                    if(array[j] != 0) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
