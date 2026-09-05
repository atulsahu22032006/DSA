class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode temp = dummy;

        for (int i = 1; i < left; i++) {
            temp = temp.next;
        }

        ListNode tail = temp;
        ListNode head2 = temp.next;

        for (int i = 1; i <= right - left + 1; i++) {
            temp = temp.next;
        }

        ListNode tail2 = temp;
        ListNode head3 = temp.next;

        tail2.next = null;

        ListNode newHead = reverse(head2);

        tail.next = newHead;

        head2.next = head3;

        return dummy.next;
    }

    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}