class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode templ = dummy;
        int count = 1;
        
        while (count < left) {
            templ = templ.next;
            count++;
        }

        ListNode prev = null;
        ListNode curr = templ.next;
        ListNode next = null;

        ListNode connection = templ;
        ListNode tail = curr;

        count = 0;
        while (count < right - left + 1) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        connection.next = prev;
        tail.next = curr;

        return dummy.next;
    }
}