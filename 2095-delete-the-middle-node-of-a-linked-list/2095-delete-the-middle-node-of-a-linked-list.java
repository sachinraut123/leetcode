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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head == null || head.next == null){
            return null;
        }
        ListNode first = head;
        ListNode slow = head;
        ListNode temp = null;

        while(first != null && first.next != null){
            temp = slow;
             slow = slow.next;
            first = first.next.next;
           
        }
        temp.next = slow.next;
        return head;
    }
}