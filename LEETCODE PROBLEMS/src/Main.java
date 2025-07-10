import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Leetcode 1480. Running Sum of 1d Array
        int sum = 0;
        int[] nums = {1,2,3,4};
        int[] result = new int[nums.length];
        int length = nums.length;
        for ( int i = 0 ; i < nums.length ; i ++){
            sum += nums[i];
            result [i] = sum;
        }
        System.out.print(Arrays.toString(result));
    }
}