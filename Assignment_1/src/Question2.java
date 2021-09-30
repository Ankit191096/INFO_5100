public class Question2 {
    public static void main(String[] args) {
        int[] array= {-7,-3,2,3,11};
        squareAndSort(array);
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    public static void squareAndSort(int[] array){
        for(int i=0; i< array.length; i++){
            array[i]= array[i] * array[i];
        }

        int temp;

        for(int i=0; i< array.length; i++){
            for(int j=0; j< array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    temp= array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                }
            }
        }
    }
}
