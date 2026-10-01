public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s, f, E;
        s = f = head;
        E = null;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;

            if (f == s) {
                E = head;
                while (s != E) {
                    s = s.next;
                    E = E.next;
                }
                return E;
            }
        }

        return E;
    }
}
