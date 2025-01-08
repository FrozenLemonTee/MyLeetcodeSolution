package Topics.Other.insertGreatestCommonDivisors;

import Utils.Structs.ListNode;

public class Solution {
    public static int gcd(int a, int b) {
        int gcd = Math.min(a, b);
        while (gcd > 0){
            if (a % gcd == 0 && b % gcd == 0){
                return gcd;
            }
            gcd -= 1;
        }
        return gcd;
    }

    public static void connect(ListNode prev, ListNode next) {
        prev.next = next;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while (cur.next != null) {
            ListNode next = cur.next;
            ListNode mid = new ListNode(gcd(cur.val, next.val));
            Solution.connect(cur, mid);
            Solution.connect(mid, next);
            cur = next;
        }
        return head;
    }
}
