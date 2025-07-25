public class LC152 {
    public static void main(String[] args) {
        int[] nums = {-2};
        int ans = maxProduct(nums);
        System.out.println(ans);
    }

    static int maxProduct(int[] nums) {
        int maxProductSoFar = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            int tempMax = currentMax; // this is to store the value to compare

            currentMax = Math.max(Math.max(num, num * currentMax), num * currentMin);
            currentMin = Math.min(Math.min(num, num * tempMax), num * currentMin);

            maxProductSoFar = Math.max(maxProductSoFar, currentMax); // actual value
        }

        return maxProductSoFar;
    }
}
