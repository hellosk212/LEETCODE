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

/*static Node reverseLL(Node head) {
		Node cur = head, prev = null;
		while(cur != null) {
			Node temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		return prev;
	}
*/


class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next== null )return head;
        ListNode temp=head.next;
        ListNode newHead=reverseList(head.next);
        temp.next=head;
        head.next=null;
        return newHead;
        
        
        
    }
}