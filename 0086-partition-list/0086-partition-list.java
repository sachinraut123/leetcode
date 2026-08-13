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
    public ListNode partition(ListNode head, int x) {
        
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode temp = head;
        ListNode t1 = l1;
        ListNode t2 = l2;

        while(temp != null){
            if(temp.val<x){
                t1.next = temp;
                t1 = t1.next;

            }else{
                t2.next = temp;
                t2 = t2.next;
            }
            temp = temp.next;
           
        }
        t2.next = null;
        t1.next = l2.next;
        head = l1.next;
        return head;

       
    }
}