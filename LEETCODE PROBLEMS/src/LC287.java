import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC287 {
    //https://leetcode.com/problems/find-the-duplicate-number/description/
    public static void main(String[] args) {
        int[] nums = {3,3,3,3};
        System.out.println(missing(nums));
    }
    static int missing(int[] nums ){
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
            return nums[index];
        }
    }
        return -1 ;
}
    static void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;

}
}

