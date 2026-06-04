package Week1.Day4;

public class Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int i=0;
        while(i<mat.length){
            sum+=mat[i][i];
            int j = mat.length-i-1;
            if(i!=j) sum+=mat[i][j];
            i++;
        }
        return sum;
    }
}
