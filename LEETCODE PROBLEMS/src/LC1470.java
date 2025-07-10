import java.util.Arrays;

public class LC1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7} ;
        int len = nums.length;
        int [] result = new int[len];
        int n = nums.length/2;

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        System.out.println(Arrays.toString(result));
    }
}

