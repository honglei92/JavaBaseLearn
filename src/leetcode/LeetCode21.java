package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 合并两个升序链表
 */
public class LeetCode21 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        ListNode listNode = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode result = mergeTwoLists(listNode, listNode2);
        print(result);
        System.out.println(System.currentTimeMillis());
    }

    private static void print(ListNode result) {
        while (result != null) {
            System.out.print(result.val + ",");
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
