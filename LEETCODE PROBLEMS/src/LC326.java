import java.util.Scanner;

public class LC326 {
    //https://leetcode.com/problems/power-of-three/description/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(power3(n));
    }
    static boolean power3 (int n){
        if ( n <= 0 ){return false ;}
        while (n%3 == 0){
            n= n/3;
        }
        return n == 1;
    }
}
