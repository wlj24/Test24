package SJJG;

import java.util.LinkedList;

public class SinglyLinkedList {
    static int size;
    Node first;
    Node last;
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        singlyLinkedList.addFirst(2);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addLast(4);
    }

    private  void addFirst(int data){
        Node node=new Node(data);
        if(size==0){
            first=node;
            last=node;
        }else if(size>0) {
            node.next = first;
            first = node;
        }
        size++;
    }

    private  void addLast(int data){
        Node node=new Node(data);
        if(size==0){
            first=node;
            last=node;
        }else if(size>0) {
            last.next = node;
            last = node;
        }
        size++;
    }

    private static class Node{
        private Node next;
        private int data;
        public Node(int data){
            this.data=data;
        }
    }
}
