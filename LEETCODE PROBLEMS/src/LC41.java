public class LC41 {
    //https://leetcode.com/problems/first-missing-positive/description/
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstmissingnum(nums));
    }
    static int firstmissingnum(int[] nums){
        // using cyclic sort
        int i = 0 ;
        while ( i < nums.length){
            int c = nums[i] -1 ;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[c]){
                swap (nums , i , c);
            }
            else{
                i++;
            }
        }
        // for the first missing element
        for (int index = 0 ; index < nums.length ; index ++){
            if (nums[index] != index+1){
                return index + 1 ;
            }
        }
        return nums.length + 1;
    }

    static void swap (int [] arr , int f , int s ){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp ;
    }
}
