
 /* Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution { //java version
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){            
            fast = fast.next.next; //2 times
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}