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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right)
        {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        int position = 1;
        while(position < left)
        {
            prev = curr;
            curr = curr.next;
            position++; 
        }
        ListNode last = prev;
        ListNode endNode = curr;
        while(position <= right)
        {
            ListNode front = curr.next;
            curr.next =prev;
            prev = curr;
            curr = front;
            position++;
        }
        if(last != null)
        {
            last.next = prev;
        }
        else
        {
            head = prev;
        }
        endNode.next = curr;
        return head;
    }
}