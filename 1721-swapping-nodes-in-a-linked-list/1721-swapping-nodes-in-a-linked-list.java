class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.next;
            count++;
        }

        ListNode temp3 = head;
        for (int i = 1; i < k; i++) {
            temp3 = temp3.next;
        }

        ListNode temp2 = head;
        for (int i = 1; i < count - k + 1; i++) {
            temp2 = temp2.next;
        }

        int num = temp3.val;
        temp3.val = temp2.val;
        temp2.val = num;

        return head;
    }
}