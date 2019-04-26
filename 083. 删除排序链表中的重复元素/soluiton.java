/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode index = head;


        while (index != null && index.next != null)
        {
            if(index.val == index.next.val)
            {
                index.next = index.next.next;
            }
            else
            {
                index = index.next;
            }
        }

        return head;
    }
}