package Topics.Other.getFinalState;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        ArrayList<Integer[]> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            lst.add(new Integer[]{nums[i], i});
        }
        PriorityQueue<Integer[]> pq = new PriorityQueue<>((a, b) -> {
            int compareFirst = Integer.compare(a[0], b[0]);
            if (compareFirst == 0) {
                return Integer.compare(a[1], b[1]);
            }
            return compareFirst;
        });
        pq.addAll(lst);
        for (int i = 0; i < k; i++) {
            Integer[] arr = pq.poll();
            if (arr != null) {
                nums[arr[1]] *= multiplier;
                arr[0] *= multiplier;
            }
            pq.add(arr);
        }
        return nums;
    }

    public int[] getFinalState2(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++){
            int min_idx = 0;
            for (int j = 0; j < nums.length; j++){
                min_idx = nums[min_idx] > nums[j] ? j : min_idx;
            }
            nums[min_idx] *= multiplier;
        }
        return nums;
    }
}
