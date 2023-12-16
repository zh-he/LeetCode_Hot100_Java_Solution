package Leetcode.MergeTwoList;

public class MergeTwoList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //创建一个新的链表，比较两个链表将小的值加入这个链表；
            //创建一个新的链表，比较两个链表将小的值加入这个链表；
            ListNode listNew = new ListNode(); //空的头结点 ，
            ListNode p = listNew;
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    p.next = list1;
                    list1 = list1.next;
                } else {
                    p.next = list2;
                    list2 = list2.next;
                }
                p = p.next;
            }
            p.next = list1 ==null ? list2 : list1;
            return p.next;

    }
}

class ListNode {
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
