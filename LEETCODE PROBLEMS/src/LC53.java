public class LC53 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,-50,-10,11,20};
        int ans = maxSubArray(nums);
        System.out.println(ans);
    }

    static int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++ ) {
            sum += nums[i];
            if (sum > maxsum){
                maxsum = sum ;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return maxsum;
    }
}
