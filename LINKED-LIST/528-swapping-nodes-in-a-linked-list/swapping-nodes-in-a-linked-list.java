class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode curr = head;

        
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        ListNode a = curr;
        ListNode b = head;

       
        while (curr.next != null) {
            curr = curr.next;
            b = b.next;
        }

       
        int temp = a.val;
        a.val = b.val;
        b.val = temp;

        return head;
    }
}