public class LC268 {
    // https://leetcode.com/problems/missing-number/description/
    public static void main(String[] args) {
        int [] nums = {3,0,1};
        System.out.println(missing(nums));
    }
    static int missing (int[] nums ){
        // using cyclic sort
        int i = 0 ;
        while ( i < nums.length){
            int c = nums[i] ;
            if (nums[i] < nums.length && nums[i] != nums[c]){
                swap (nums , i , c);
            }
            else{
                i++;
            }
        }
        // for the first missing element
        for (int index = 0 ; index < nums.length ; index ++){
            if (nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }

    static void swap (int [] arr , int f , int s ){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp ;
    }

}
