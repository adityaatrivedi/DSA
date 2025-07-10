import java.util.Scanner;

public class LC231 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(power(n));


    }
    static boolean power(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }
}

