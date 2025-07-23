public class LC1342 {
    public static void main(String[] args) {
        int num = 1009;
        int answer = numberOfSteps(num);
        System.out.println(answer);
    }

    static int numberOfSteps(int num) {
        int ans = makeZeros(num);
        return ans;
    }

    static int makeZeros(int num) {
        int c = 0;
        if (num == 0) {
            return c;
        }
        if (num / 10 != 0) {
            c++;
        }
        if (num == 0) {
            return 0;
        }
        return c;
    }
}
