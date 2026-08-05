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
    public ListNode detectCycle(ListNode head) {
        
        HashMap<ListNode, Integer> ans = new HashMap<>();
        ListNode temp = head;
        int index = 0;

        while(temp != null){
           if( ans.containsKey(temp)){
            return temp;
           }
           ans.put(temp,index);
           temp = temp.next;

        }
    return temp;
    }
}