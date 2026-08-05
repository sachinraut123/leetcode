/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode first =head;
        ListNode slow = head;

        while(first != null && first.next != null){
            first = first.next.next;
            slow = slow.next;
            if(slow==first){
                return true;
            }
        }
        return false;
    }
}