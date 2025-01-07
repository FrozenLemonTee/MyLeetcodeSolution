package _Util._Structs;

import _Util._Methods.Methods;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next;}

     static public ListNode toList(int[] list) {
        return toList(Methods.toArrayList(Methods.toArray(list)));
     }

     static public ListNode toList(List<Integer> list){
         ListNode head = new ListNode();
         ListNode cur = head;
         for (int val : list) {
             cur.next = new ListNode(val);
             cur = cur.next;
         }
         return head.next;
     }

     @Override
     public String toString() {
         return "ListNode(val=" + val + ", next=" + next + ")";
     }
 }
