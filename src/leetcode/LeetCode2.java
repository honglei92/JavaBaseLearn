package leetcode;

/**
 * 两数相加
 */

public class LeetCode2 { 

    public static void main(String[] args) {
        ListNode l1N0 = new ListNode(2);
        // ListNode l1N1 = new ListNode(4, l1N0);
        // ListNode l1N2 = new ListNode(3, l1N1);

        // l1N0.next = l1N1;
        // l1N1.next = l1N2;

        ListNode l2N0 = new ListNode(2);
        // ListNode l2N1 = new ListNode(4, l2N0);
        // ListNode l2N2 = new ListNode(3, l2N1);

        // l2N0.next = l2N1;
        // l2N1.next = l2N2;

        ListNode l3 = addTwoNumber(l1N0, l2N0);
        System.out.println(l3.val);
    }

    public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum / 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }

        return pre.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int x) {
        this.val = x;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
