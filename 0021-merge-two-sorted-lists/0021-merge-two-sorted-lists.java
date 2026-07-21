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

    // head of the result linked list
    
    public ListNode mergeTwoLists(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode start = first;
        ListNode begin = second;
        while(start != null && begin != null)
        {
            if(start.val <= begin.val)
        
            {
                curr.next = new ListNode(start.val);
                curr = curr.next;
                start = start.next;
            }   
            else
            {
                curr.next = new ListNode(begin.val);
                curr = curr.next;
                begin = begin.next;
            }
              
        }
        while(start != null)
        {
            curr.next = new ListNode(start.val);
            curr = curr.next;
            start = start.next;
        }
        while(begin != null)
        {
            curr.next = new ListNode(begin.val);
            curr = curr.next;
            begin = begin.next;
        }
        return dummy.next;
    }
}