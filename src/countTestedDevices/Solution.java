package countTestedDevices;

public class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int res = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] > 0) {
                res += 1;
                for (int j = i + 1; j < batteryPercentages.length; j++) {
                    batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
                }
            }
        }
        return res;
    }

    public int countTestedDevices2(int[] batteryPercentages) {
        int res = 0;
        int no_power = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] - i + no_power > 0){
                res += 1;
            }else {
                no_power += 1;
            }
        }
        return res;
    }
}
