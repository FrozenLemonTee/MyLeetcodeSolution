package Topics.SlidingWindow.maxSatisfied;

public class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int more_satisfied = this.initCnt(customers, grumpy, minutes);
        int max_more_satisfied = more_satisfied;
        for (int end = minutes; end < customers.length; end++) {
            if (grumpy[end] == 1)
                more_satisfied += customers[end];
            if (grumpy[end - minutes] == 1)
                more_satisfied -= customers[end - minutes];
            max_more_satisfied = Math.max(max_more_satisfied, more_satisfied);
        }
        return this.satisfied(customers, grumpy) + max_more_satisfied;
    }

    public int initCnt(int[] customers, int[] grumpy, int minutes){
        int cnt = 0;
        for(int i = 0; i < minutes; i++){
            if(grumpy[i] == 1)
                cnt += customers[i];
        }
        return cnt;
    }

    public int satisfied(int[] customers, int[] grumpy){
        int cnt = 0;
        for(int i = 0; i < customers.length; i++){
            if (grumpy[i] == 0)
                cnt += customers[i];
        }
        return cnt;
    }


    public int maxSatisfied2(int[] customers, int[] grumpy, int minutes){
        int satisfied = 0;
        int more_satisfied = 0;
        for(int i = 0; i < minutes; i++){
            if (grumpy[i] == 1)
                more_satisfied += customers[i];
            if (grumpy[i] == 0)
                satisfied += customers[i];
        }
        int max_more_satisfied = more_satisfied;
        for (int end = minutes; end < customers.length; end++) {
            if (grumpy[end] == 0)
                satisfied += customers[end];
            if (grumpy[end] == 1)
                more_satisfied += customers[end];
            if (grumpy[end - minutes] == 1)
                more_satisfied -= customers[end - minutes];
            max_more_satisfied = Math.max(max_more_satisfied, more_satisfied);
        }
        return satisfied + max_more_satisfied;
    }
}
