class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode prevgpend = temp;
        while (true) {
            ListNode kth = prevgpend;
            for (int i = 1; i <= k && kth != null; i++)
                kth = kth.next;
            if (kth == null)
                break;
            ListNode gpstart = prevgpend.next;
            ListNode nextgpstart = kth.next;
            ListNode current, prev, nextNode;
            prev = nextgpstart;
            current = gpstart;
            while (current != nextgpstart) {
                nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            prevgpend.next = kth;
            prevgpend = gpstart;
        }
        return temp.next;
    }
}
