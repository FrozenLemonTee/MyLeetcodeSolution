package numOfSubarrays;

public class Solution {
    public double avgSubArray(int[] arr, int start, int len) {
        double sum = 0;
        for (int i = start; i < start + len; i++) {
            sum += arr[i];
        }
        return sum / len;
    }

    // out of time limit
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            if (this.avgSubArray(arr, i, k) >= threshold) {
                count += 1;
            }
        }
        return count;
    }

    public int numOfSubarrays2(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int l = 0, r = 0;
        while (r < k){
            sum += arr[r];
            r += 1;
        }
        while (r < arr.length){
            if (sum >= threshold * k){
                count += 1;
            }
            sum -= arr[l];
            sum += arr[r];
            l += 1;
            r += 1;
        }
        if (sum >= threshold * k){
            count += 1;
        }
        return count;
    }
}
