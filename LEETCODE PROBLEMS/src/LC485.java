public class LC485 {
    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1,1,1};
        int count = 0;
        int streak = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 1) {
                count++;
                streak = Math.max(count, streak);
            }
            else {
                count = 0;
            }
        }
        System.out.print(streak);
    }
}
