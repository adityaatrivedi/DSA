import java.util.Arrays;
//https://leetcode.com/problems/rotate-array/description/
public class LC189 {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7};
    rotate(nums , 4);
    System.out.println(Arrays.toString(nums));
    }
    static void rotate(int[] nums, int k) {
        // reverse the list three times
        int len = nums.length;
        k = k%len ;
        reverse(nums, 0, len-1); // full array is revrsed
        reverse(nums, 0, k-1); // first k elemnts reverses
        reverse(nums, k, len-1); // all the remaining elements are reversed
    }
    static void reverse (int[] nums , int start , int end ){
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp ;
            start++;
            end--;
        }

    }
}
