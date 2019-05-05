/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * ����һ����������ɾ�����к����ظ����ֵĽڵ㣬ֻ����ԭʼ������û���ظ����ֵ����֡�
 *
 * ʾ�� 1:
 * ����: 1->2->3->3->4->4->5
 * ���: 1->2->5
 *
 * ʾ�� 2:
 * ����: 1->1->1->2->3
 * ���: 2->3
 *
 * ��������Ľڵ�dummy,p ��p���ж������е�ֵ
 * ���������ȵ�ֵ�������ȵ�ֵsameNum���������������ж��Ƿ�����sameNum��ȣ��еĻ�������
 * û�еĻ�ֱ�ӵ��¸��������ж�
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
