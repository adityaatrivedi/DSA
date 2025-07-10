public class LC1295 {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896,7888};
        System.out.println(even(nums));
    }
    static int even(int[] nums){
        // Retrive an element from the array
        // Divide the element by 10 , count ++
        // repeat and reset count
        // then check if count is even then result++

        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            count = 0;
            while (num>0) {
                int digit = num / 10;
                num = num/10;
                count++;
            }
            if(count%2==0){
                result++;
            }
        }
        return result;
    }
}
