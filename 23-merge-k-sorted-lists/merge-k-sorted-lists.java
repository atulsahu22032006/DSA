class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        ArrayList<ListNode> arr = new ArrayList<>();

        for (ListNode node : lists) {
            if (node != null) {
                arr.add(node);
            }
        }

        if (arr.size() == 0) {
            return null;
        }

        while (arr.size() > 1) {

            ListNode a = arr.remove(arr.size() - 1);
            ListNode b = arr.remove(arr.size() - 1);

            ListNode c = merge(a, b);

            arr.add(c);
        }

        return arr.get(0);
    }

    ListNode merge(ListNode head1, ListNode head2) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (head1 != null && head2 != null) {

            if (head1.val <= head2.val) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        if (head1 != null) {
            temp.next = head1;
        }

        if (head2 != null) {
            temp.next = head2;
        }

        return dummy.next;
    }
}