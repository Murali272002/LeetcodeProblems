package com.linkedList;

public class RemoveDuplicateElements {

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next=new ListNode(1);
        head.next.next = new ListNode(2);

        ListNode head1 =  removeDuplicateElements(head);
        show(head1);

    }

    public static ListNode removeDuplicateElements(ListNode head){

        while(head.next != null){
            if(head.val == head.next.val){
                head = head.next;
            }
            head = head.next;
        }
        return head;
    }

    static  void show(ListNode node){
        while(node != null){
            System.out.println(node.val+ " ");
            node = node.next;
        }
    }
}
