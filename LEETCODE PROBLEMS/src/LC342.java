import java.util.Scanner;

public class LC342 {
    //https://leetcode.com/problems/power-of-four/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(power4(n));
    }
    static boolean power4 (int n ){
        if (n<= 0 ){return false;}
        while (n%4==0){
            n=n/4;
        }
        return n==1;
    }
}
