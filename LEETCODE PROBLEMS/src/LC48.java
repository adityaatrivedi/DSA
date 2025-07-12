import java.util.Arrays;

public class LC48 {
    // https://leetcode.com/problems/rotate-image/
    public static void main(String[] args) {
    int [][] nums = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
    rotate(nums);
    System.out.println(Arrays.toString(nums));
    }
    static void rotate (int[][] nums){
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length ; col++) {
                int temp = nums[row][col] ;
                nums[row][col] = nums[col][row];
                nums[col][row] = temp ;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            reverse(nums[i]);
        }

    }
    static void reverse (int[] nums){
        int start =0;
        int end = nums.length-1;
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp ;
            start++;
            end--;
        }

    }
}
