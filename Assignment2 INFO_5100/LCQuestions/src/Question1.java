public class Question1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        for(int i = 0; i < transpose(matrix).length; i++){
            for(int j = 0; j < transpose(matrix).length; j++){
                System.out.print(transpose(matrix)[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        if(matrix.length == 0){
            return matrix;
        }
        int ptr1;
        int ptr2;
        int[][] output= new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix[0].length; i++){
            ptr1 = i;
            ptr2 = 0;
            for(int j = 0; j < matrix.length; j++){
                output[ptr1][ptr2] = matrix[j][i];
                ptr2++;
            }
        }
        return output;
    }
}
