package com.linkedList;

public class Runner {

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.insert(5);
        linkedList.insert(10);
        linkedList.insert(15);
        linkedList.insert(20);

        linkedList.deleteAt(2);

        linkedList.show();

    }
}
