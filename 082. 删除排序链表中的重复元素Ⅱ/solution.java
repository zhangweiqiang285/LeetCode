/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中没有重复出现的数字。
 *
 * 示例 1:
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 *
 * 示例 2:
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 *
 * 创建虚拟的节点dummy,p 用p来判断链表中的值
 * 如果存在相等的值，则把相等的值sameNum保留下来，继续判断是否有与sameNum相等，有的话就跳过
 * 没有的话直接到下个结点继续判断
 */



class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;

        while(p.next != null && p.next.next != null)
        {
            if(p.next.val == p.next.next.val)
            {
                int sameNum = p.next.val;
                while(p.next != null && p.next.val == sameNum)
                {
                    p.next = p.next.next;
                }
            }
            else
            {
                p = p.next;
            }
        }
        return dummy.next;
    }
}
