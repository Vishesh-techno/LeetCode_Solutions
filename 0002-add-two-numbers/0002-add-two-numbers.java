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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode idx = ans;
        int carry = 0;
        while(l1 != null || l2 != null){
            int sum = 0 + carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next; 
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;;
            }
            carry = sum/10;
            sum = sum%10;

            idx.next = new ListNode(sum);
            idx = idx.next;
        }
        if(carry == 1){
            idx.next = new ListNode(1);
        }
        return ans.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna