package SJJG;

public class TouChaTest {
    public static void main(String[] args) {
        Node node=insert(null,1);
        node=insert(node,2);
        node=insert(node,3);
        display(node);
    }


    public static Node insert(Node head,int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
        return head;
    }
    public static void display(Node head){
        Node start=head;
        while (start!=null){
            System.out.println(start.data+"");
            start=start.next;
        }
    }
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
}
