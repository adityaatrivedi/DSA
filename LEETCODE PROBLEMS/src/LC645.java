import java.util.Arrays;

public class LC645 {
    // https://leetcode.com/problems/set-mismatch/description/
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(SetMismatch(nums)));
    }
    static int[] SetMismatch(int[] nums ){
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] -1 ;
            if (nums[i] != nums[correct]) {
                swap(nums,i , correct);
            } else {
                i++;
            }
        }

        // returning the duplicate
        for (int index = 0; index < nums.length; index++) {
            if (index +1 != nums[index]) {
                return new int[] {nums[index] , index +1};
            }
        }
        return new int[] {-1,-1} ;
    }
    static void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;

    }
}
