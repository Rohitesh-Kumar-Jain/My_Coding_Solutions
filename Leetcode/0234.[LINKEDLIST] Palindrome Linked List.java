class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode l2=slow.next;
        while(fast.next!=null && fast!=null){
            fast= fast.next;
            if(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
                l2 = slow.next;
            }
            else{
                l2=slow.next.next;
                break;
            }
        }
        slow.next=null;
        ListNode l1 = reverse(head);
        while(l1!=null){
            if(l1.val!=l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        if(head.next==null || head ==null) return head;
        ListNode p = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}