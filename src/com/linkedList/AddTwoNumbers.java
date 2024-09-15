package com.linkedList;

public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(0);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(4);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode l3 = new ListNode(0);
        ListNode result = l3;
        int carry =0;

        while(l1 != null && l2 != null){
            int value = l1.val+l2.val+carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int value = l1.val+carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l1 = l1.next;
        }
        while(l2 != null){
            int value = l2.val+carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l2 = l2.next;
        }
        return result.next;
    }

}
