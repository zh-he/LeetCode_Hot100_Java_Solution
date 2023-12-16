package Leetcode.AddTwoNums;

public class AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { // l1和l2分别为两个链表的头结点
       ListNode pre = new ListNode(0); //pre指向头结点
       ListNode cru = pre; //cru代表当前节点
       int remainder = 0; // remainder代表余数
       while(l1 != null || l2 != null){ //l1 和l2 不全为空
           int num1 = l1 == null ? 0 : l1.val;
           int num2 = l2 == null ? 0 : l2.val;
           int sum = num1 + num2 +remainder;
           remainder = sum / 10;
           sum = sum % 10;
           cru.next = new ListNode(sum);
           cru = cru.next;
       }
       if(remainder == 1){ //最后一位为1，则多新增一个节点
           cru.next = new ListNode(1);
           cru = cru.next; //
       }
       return pre.next;
    }
}
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
