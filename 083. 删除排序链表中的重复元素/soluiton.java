/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * ����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�
 *
 * ʾ�� 1:
 * ����: 1->1->2
 * ���: 1->2
 *
 * ʾ�� 2:
 * ����: 1->1->2->3->3
 * ���: 1->2->3
 * 
 * ���ڲ���Ҫɾ��ͷ��㣬������dummy����head�Ϳ��ԣ�Ȼ��ѭ���ж�ֵ�Ƿ���ȣ���ȵĻ�����
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