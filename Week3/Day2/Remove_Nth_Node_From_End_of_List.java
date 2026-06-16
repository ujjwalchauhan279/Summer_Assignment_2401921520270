package Week3.Day2;

public class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1; i<=n; i++){
            fast=fast.next;
        }
        if(fast==null) return head.next;
        while(fast!=null){
            if(fast.next==null){
                slow.next=slow.next.next;
                return head;
            }
            else{
                slow=slow.next;
                fast=fast.next;
            }
        }
        return head;
    }
}
