package twoSum;

import java.util.*;

public class Solution {
    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, nums.length - 1};
    }

    private int binarySearch(ArrayList<ArrayList<Integer>> list, int left, int right, int target) {
        assert left <= right;
        assert 0 <= left && left <= list.size() - 1;
        assert right <= list.size() - 1;
        int l = left;
        int r = right;
        int mid = (l + r) / 2;
        while (l <= r) {
            if (list.get(mid).getFirst() == target) {
                return list.get(mid).getLast();
            }else if (list.get(mid).getFirst() > target) {
                r = mid - 1;
            }else {
                l = mid + 1;
            }
            mid = (l + r) / 2;
        }
        return -1;
    }


    public int[] twoSum(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(nums[i]);
            pair.add(i);
            list.add(pair);
        }
        list.sort(Comparator.comparingInt(ArrayList::getFirst));
        for (int i = 0; i < list.size(); i++) {
            int index2 =  this.binarySearch(list, i + 1, list.size() - 1, target - list.get(i).getFirst());
            if (index2 != -1) {
                return new int[]{list.get(i).getLast(), index2};
            }
        }
        return new int[]{0, nums.length - 1};
    }

    public int[] twoSum3(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(target - num) && map.get(target - num) != i) {
                return new int[] {i, map.get(target - num)};
            }
        }
        return new int[]{0, nums.length - 1};
    }
}
