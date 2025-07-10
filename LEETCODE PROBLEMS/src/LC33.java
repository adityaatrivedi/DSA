import java.util.Arrays;

public class LC33 {
    // https://leetcode.com/problems/search-in-rotated-sorted-array/
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums , 2));
    }

    static int search(int [] nums , int target ){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {
                // left half is sorted
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1; // search left
                } else {
                    start = mid + 1; // search right ✅ FIXED
                }
            } else {
                // right half is sorted
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // search right
                } else {
                    end = mid - 1; // search left
                }
            }
        }
        return -1;
        }
    }
