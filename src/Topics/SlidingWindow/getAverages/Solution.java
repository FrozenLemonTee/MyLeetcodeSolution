package Topics.SlidingWindow.getAverages;

import java.util.Arrays;

public class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];

        // 初始时将 avgs 数组所有元素设置为 -1
        Arrays.fill(avgs, -1);

        // 如果数组长度小于 2k + 1，则没有任何位置能形成一个有效的子数组
        if (n < 2 * k + 1) {
            return avgs;
        }

        long sum = 0;

        // 计算前 k + 1 个元素的和
        for (int i = 0; i < 2 * k + 1; i++) {
            sum += nums[i];
        }

        // 遍历每个可能的中心元素
        for (int i = k; i < n - k; i++) {
            // 如果当前位置能形成有效的半径为 k 的子数组
            avgs[i] = (int) (sum / (2 * k + 1));  // 使用截断式整数除法
            // 更新 sum: 滑动窗口
            if (i + k + 1 < n) {
                sum += nums[i + k + 1] - nums[i - k];  // 滑动窗口时加入右边的元素，移除左边的元素
            }
        }

        return avgs;
    }
}
