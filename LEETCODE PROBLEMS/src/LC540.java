public class LC540 {
    //https://leetcode.com/problems/single-element-in-a-sorted-array/
    public static void main(String[] args) {
    int[] nums = {1,1,2,3,3,4,4,8,8};
        dup(nums);
    }
    static int dup (int[] nums){
        // we do simple binary searches and then instead of returning the matched value we return the unmatched value
        int start = 0 ;
        int end = nums.length -1 ;
        int ans = 0;
        for ( int i = 0 ; i <= end ; i++){
            int target = nums[i];
            int mid = start + (end - start)/2 ;

            if (nums[mid] != 0 ){
                 ans = nums[mid] ;
            }
            else if(nums[mid] > target) {
                end = mid -1 ;
            }
            else {
                start = mid +1 ;
            }
        }
        return ans ;
    }
}
