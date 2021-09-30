public class Question3 {
    public static void main(String[] args) {
        int[] array = {2,3,4,2,2,3,5,7};
       repetingElement(array);
    }

    public static void repetingElement(int[] array){
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j <= array.length; j++)
            {
                if (j == array.length)
                {
                    System.out.println(array[i]);
                    return;
                }
                if (j != i && array[i] == array[j])
                {
                    break;
                }
            }
        }
    }
}
