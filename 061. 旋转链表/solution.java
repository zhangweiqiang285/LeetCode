/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
            return head;

        ListNode cur = head;

        int length = 1;
        while (cur.next!=null)
        {
            cur = cur.next;
            length++;
        }
        
        cur.next = head;

        int step = k % length;

        for(int i = 1; i < length - step; i++)
        {
            head = head.next;
        }
        
        ListNode res = head.next;
        head.next = null;

        return res;
    }
}