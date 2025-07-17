import java.util.Arrays;

public class LC4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] ans = new int[len];

        // copy nums1
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nums1[i];
        }

        // copy nums2
        for (int i = 0; i < nums2.length; i++) {
            ans[nums1.length + i] = nums2[i];
        }

        // sort merged array
        Arrays.sort(ans);

        if (len % 2 == 0) {
            int mid1 = len / 2;
            int mid2 = mid1 - 1;
            return (ans[mid1] + ans[mid2]) / 2.0;
        } else {
            return ans[len / 2];
        }
    }
}