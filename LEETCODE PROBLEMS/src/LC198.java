public class LC198 {
    //https://leetcode.com/problems/house-robber/
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        System.out.println(even(nums));
    }
    static int even (int[] nums){
        int i = 0;
        int n = nums.length -1;
        int evenSum = 0;
        while (i < n){
            int temp = nums[i];
            evenSum = evenSum + temp ;
            i = i+2; // for skipping the odd index
        }
        return evenSum ;
    }

    static int odd (int[] nums){
        int i = 1;
        int n = nums.length -1;
        int oddSum = 0;
        while (i < n){
            int temp = nums[i];
            oddSum = oddSum + temp ;
            i = i+2; // for skipping the even index
        }
        return oddSum ;
    }
}
