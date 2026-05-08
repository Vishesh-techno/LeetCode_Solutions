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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if(size == n) return head.next;
        int k = size - n;
        ListNode tem = head;
        for (int i = 1; i < k; i++) {
            tem = tem.next;
        }
        // if (tem.next != null && tem != null) {
            tem.next = tem.next.next;
        // }
        return head;
    }
}