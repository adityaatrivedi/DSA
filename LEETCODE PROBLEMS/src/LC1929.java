import java.util.Arrays;

public class LC1929 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1};
        int[] result = add(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] add(int[] nums) {
        int len = nums.length;
        int[] result = new int[2 * len];

        // First copy
        for (int i = 0; i < len; i++) {
            result[i] = nums[i];
        }

        // Second copy
        for (int i = 0; i < len; i++) {
            result[i + len] = nums[i];
        }

        return result;
    }
}