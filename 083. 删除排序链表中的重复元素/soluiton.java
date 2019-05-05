/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 * 输入: 1->1->2
 * 输出: 1->2
 *
 * 示例 2:
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 * 
 * 由于不需要删除头结点，所以用dummy等于head就可以，然后循环判断值是否相等，相等的话跳过
 */


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = head;


        while (dummy != null && dummy.next != null)
        {
            if(dummy.val == dummy.next.val)
            {
                dummy.next = dummy.next.next;
            }
            else
            {
                dummy = dummy.next;
            }
        }

        return head;
    }
}