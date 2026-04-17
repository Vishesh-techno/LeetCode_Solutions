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
    public ListNode helper(ListNode prev, ListNode curr){
        if(curr == null){
            return prev;
        }
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;

        return helper(prev, curr);

    }
    // public ListNode reverseList(ListNode head) {
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     // ListNode next;

    //     // while (curr != null) {
    //     //     next = curr.next;
    //     //     curr.next = prev;
    //     //     prev = curr;
    //     //     curr = next;
    //     // }

    //     helper(prev, curr);
    //     return prev;
    // }
    public ListNode reverseList(ListNode head) {
        return helper(null, head);
    }
}