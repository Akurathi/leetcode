/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class SwapNodePairsSolution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null && current.next!=null) {
            ListNode second = current.next;
            ListNode nextNextNode = second.next;

            second.next = current;
            current.next = nextNextNode;
            prev.next = second;

            prev = current;
            current = nextNextNode;
        }

        return dummy.next;
    }
}
