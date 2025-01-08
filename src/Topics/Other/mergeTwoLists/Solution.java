package Topics.Other.mergeTwoLists;

import Utils.Structs.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode p = head, p1 = list1, p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                p.next = new ListNode(p1.val);
                p1 = p1.next;
            }else {
                p.next = new ListNode(p2.val);
                p2 = p2.next;
            }
            p = p.next;
        }
        while (p1 != null) {
            p.next = new ListNode(p1.val);
            p1 = p1.next;
            p = p.next;
        }
        while (p2 != null) {
            p.next = new ListNode(p2.val);
            p2 = p2.next;
            p = p.next;
        }
        return head.next;
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode p = head, p1 = list1, p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                ListNode tmp = p1.next;
                p1.next = null;
                p.next = p1;
                p1 = tmp;
            }else {
                ListNode tmp = p2.next;
                p2.next = null;
                p.next = p2;
                p2 = tmp;
            }
            p = p.next;
        }
        while (p1 != null) {
            ListNode tmp = p1.next;
            p1.next = null;
            p.next = p1;
            p1 = tmp;
            p = p.next;
        }
        while (p2 != null) {
            ListNode tmp = p2.next;
            p2.next = null;
            p.next = p2;
            p2 = tmp;
            p = p.next;
        }
        return head.next;
    }
}
