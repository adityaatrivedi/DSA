import java.util.Arrays;
import java.util.Scanner;

public class LC59 {
    // https://leetcode.com/problems/spiral-matrix-ii/description/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] result = genmatrix(n);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

    }
    static int[] [] genmatrix (int n){
        int[][] result = new int[n][n];
        int top = 0 ;
        int bottom = result.length - 1;
        int left = 0 ;
        int right = result[0].length - 1;
        int count = 1;

        while(top<=bottom && left<=right){

            // top row
            for(int i = left ; i <= right ; i++){
                    result[top][i] = count++;
            }
            top++;

            // right coloumn
            for (int i = top; i <= bottom; i++) {
                result[i][right]=count++;
            }
            right -- ;

            // bottom row
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = count++;
                }
                bottom--;
            }
            // left coloumn
            if (left <= right) {
                for (int i = bottom; i >= top ; i--) {
                    result[i][left]=count++;
                }
                left ++;
            }
        }
        return result;
    }
}
