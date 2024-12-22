package merge;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        int i = 0, j = 0, k = 0;
        for (; k < m + n; k++) {
            if (i == m || j == n) {
                break;
            }
            if (nums1[i] < nums2[j]) {
                nums[k] = nums1[i];
                i++;
            }else {
                nums[k] = nums2[j];
                j++;
            }
        }
        while (i < m){
            nums[k++] = nums1[i++];
        }
        while (j < n){
            nums[k++] = nums2[j++];
        }
        System.arraycopy(nums, 0, nums1, 0, m + n);
    }

    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length - 1, i = m - 1, j = n - 1;
        for (; k >= 0 && i >= 0 && j >= 0; k--){
            if (nums1[i] > nums2[j]){
                nums1[k] = nums1[i--];
            }else {
                nums1[k] = nums2[j--];
            }
        }
        while (i >= 0){
            nums1[k--] = nums1[i--];
        }
        while (j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}
