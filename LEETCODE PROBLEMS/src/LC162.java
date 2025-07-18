public class LC162 {
    public static void main(String[] args) {
    int []  nums = {1,2,3,1};
        System.out.println(findMax(nums));
    }
    static int findMax(int[] nums){
        int start = 0;
        int end = nums.length -1 ;

        while (start <= end ){
            int mid = start + (end-start)/2;
            if (nums[mid] < nums[mid+1]){
                start = mid +1;
            }
            else {
                end = mid -1 ;
            }
        }
        return nums[end] ;
    }
}
