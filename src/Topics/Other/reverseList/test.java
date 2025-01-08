package Topics.Other.reverseList;

import Utils.Structs.ListNode;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseList(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
    }
}
