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
    public ListNode rotateRight(ListNode head, int k) {
        
        ListNode temp = head;
        int count  = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(count==0 || head==null || head.next == null){
            return head;
        }
        k=k%count;


        ListNode slow = head;
        ListNode fast = head;

        for(int i=1; i<=k; i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;


    }
}