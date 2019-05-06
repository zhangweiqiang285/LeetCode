 public ListNode test(ListNode l1, ListNode l2){
        
        ListNode dummy = new ListNode(0);
        int sum = 0;
        List p1 = l1, p2 = l2;
        ListNode cur = dummy;
        
        while(p1 != null || p2 != null)
        {

            if(p1 != null)
            {
                sum += p1.value;
                p1 = p1.next
            }
            
            if(p2 != null){
                sum += p2.value;
                p2 = p2.next;
            }
            cur.next = new ListNode(sum % 10)
            sum /= 10; 
            cur = cur.next;
        }
        if(sum == 1)
        {
            cur.next = new ListNode(1);
        }
        
        return dummy
    }