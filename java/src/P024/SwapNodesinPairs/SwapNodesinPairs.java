package P024.SwapNodesinPairs;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head != null && head.next != null) {
            ListNode next = head.next;
            ListNode temp = next.next;

            next.next = head;
            head.next = this.swapPairs(temp);

            return next;
        }
        return head;
    }
}
