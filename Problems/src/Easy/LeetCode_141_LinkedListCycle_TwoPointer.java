package Easy;

public class LeetCode_141_LinkedListCycle_TwoPointer {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            } else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }

        return true;
    }
}
