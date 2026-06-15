package Week3.Day1;


public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode fwd = head;
        ListNode prev = null;

        while (fwd != null) {
            fwd = fwd.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        return prev;
    }
}
