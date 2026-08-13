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
    public ListNode oddEvenList(ListNode head) {
        
        int index = 1;
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode o = odd;
        ListNode e = even;
        ListNode temp = head;

        while(temp != null){
            if(index%2==0){
                e.next = temp;
                e = e.next;
            }else{
                o.next = temp;
                o = o.next;
            }
            temp = temp.next;
            index++;
        }
        e.next=null;
        o.next = even.next;
        head = odd.next;
        return head;
    }
}