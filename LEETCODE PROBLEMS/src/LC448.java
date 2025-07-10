import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC448 {
    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    static List<Integer> findDisappearedNumbers (int[] nums){
        int i = 0 ;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums , i , correct);
            }
            else {
                i++;
            }
        }
        // to return the places where they are not in thier places
        ArrayList <Integer> mis = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1 ){
                mis.add(index+1);

            }
        }
        return mis ;
    }
    static void swap (int [] arr , int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
