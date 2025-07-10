import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC54 {
    // https://leetcode.com/problems/spiral-matrix/description/
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiral(matrix));
    }
    static List<Integer> spiral(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1; // gets the no. of coloumns

        while (top <= bottom && left <= right) {

            // top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // right colomn
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // bottom row
            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;

            // left coloumn
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }
        return result;
    }
}
