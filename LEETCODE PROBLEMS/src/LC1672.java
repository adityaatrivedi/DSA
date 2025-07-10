import java.util.Arrays;

public class LC1672 {
    // https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6},
                {1 ,2 ,1}
        };
        int sum = 0;
        int max = 0 ;
        int[] tmp = new int[accounts.length];
        for (int row = 0; row < accounts.length; row++) {
            tmp = accounts[row];
            sum = 0 ;
            for (int i = 0; i < tmp.length; i++) {
                sum += tmp[i];
                max = Math.max(sum,max);
            }

        }
        System.out.println(max);
    }

}

