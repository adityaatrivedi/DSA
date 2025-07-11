import java.util.ArrayList;
import java.util.List;

public class LC442 {
    // https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(missing(nums));
    }
    static List<Integer> missing(int[] nums ){
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
        List <Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (index +1 != nums[index]) {
               ans.add(nums[index]);
            }
        }
        return ans ;
    }
    static void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;

    }
}

