class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode left = head;
        ListNode right = head.next;

        while (left != null && right != null) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;

            if (right.next == null) break;

            left = right.next;
            if (left.next == null) break;

            right = left.next;
        }

        return head;
    }
}