import java.util.Arrays;

public class LC34 {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 7;
        int result[] = searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] searchRange(int[] nums, int target) {
        // binary search twice
        // stop the first loop when we get the first hit then restart search keeping the hit as the first element excluding it
        int start = 0 ;
        int end = nums.length - 1;
        int pos1 = -1;
        int pos2 = -1;
        int[] ans = new int[2];


        // first search
        while (start<=end){
            int mid = start + (end - start)/2;
            if (nums[mid]== target){
                pos1 = mid;
                start = mid +1 ;
            }
            else if (target > nums[mid]){
                start = mid + 1 ;
            }
            else {
                end = mid - 1;
            }
        }
        start = 0;
        end = nums.length-1;
        while (start <= end ){
            int mid = start + (end - start) / 2 ;
            if (nums[mid]== target){
                pos2 = mid ;
                end = mid - 1;
            }
            else if (target > nums[mid]){
                start = mid +1;
            }
            else {
                end = mid -1 ;
            }
        }
        ans[0] = pos2;
        ans[1] = pos1;
        return ans;
    }
}

