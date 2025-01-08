package Topics.Other.insertGreatestCommonDivisors;

import Utils.Structs.ListNode;

public class test {
    public static void printAns(ListNode head){
        head = new Solution().insertGreatestCommonDivisors(head);
        ListNode h1 = head;
        while (h1 != null) {
            System.out.print(h1.val + " ");
            h1 = h1.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test.printAns(new ListNode(18, new ListNode(6, new ListNode(10, new ListNode(3)))));
        test.printAns(new ListNode(7));
        test.printAns(new ListNode(7, new ListNode(5, new ListNode(4))));
        System.out.println(new Solution().insertGreatestCommonDivisors(ListNode.toList(new int[] {18, 6, 10, 3})));
        System.out.println(new Solution().insertGreatestCommonDivisors(ListNode.toList(new int[] {7})));
        System.out.println(new Solution().insertGreatestCommonDivisors(ListNode.toList(new int[] {7, 5, 4})));
    }
}
