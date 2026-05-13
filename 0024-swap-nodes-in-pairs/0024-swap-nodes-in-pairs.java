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
    public void helper(ListNode prev, ListNode curr){
        if(curr == null || curr.next == null){
            return;
        }
        ListNode first = curr;
        ListNode second = curr.next;

        first.next = second.next;
        second.next = first;
        prev.next = second;

        helper(first, first.next);
    }
    public ListNode swapPairs(ListNode head) {
       ListNode dummy = new ListNode(-1);
       dummy.next = head;
       ListNode p = dummy;
       helper(p, head);
       return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna