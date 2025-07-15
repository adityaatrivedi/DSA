import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15 {
    public static void main(String[] args) {

    }
    static List<List<Integer>> threeSum(int[] nums) {
        // sort the array
        // loop from 0 to len -2
        // set pointers such that we can avoid duplicates if i-1 == i then skip

        List <List<Integer>> myList = new ArrayList<>();
        int n = nums.length;
        // sort the array
        Arrays.sort(nums);
        for( int i = 0; i < n - 2; i++ ){
            // skip the duplicates
            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = n -1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if( sum == 0 ){
                    myList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // find the duplicates
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if( sum < 0 ){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return myList;
    }
}
