package SJJG;

public class LinkListTest {
    private int size;
    private Node head;
    private Node last;
    public LinkListTest(){
        size=0;
        head=null;
        last=null;
    }

    //向链表头添加元素
    public Object addHead(Object obj) {
        Node newHead = new Node(obj);
        if (size == 0) {
            head =newHead;
            last=newHead;
        } else {
            newHead.next = head;
            head.before=newHead;
            last=head;
            head = newHead;
        }
        size++;
        return obj;
    }

    public Object addLast(Object obj){
        Node lastHead=new Node(obj);
        if (size == 0) {
            head =lastHead;
            last=lastHead;
        } else {
             last.next=lastHead;
             lastHead.before=last;
             last=lastHead;
        }
        size++;
        return obj;
    }

    public Object addIndex(int i, Object obj) {

        if (i > size) {
            throw new IndexOutOfBoundsException("数据越界异常");
        }
        Node node = new Node(obj);
        if (i == 0) {
            head = node;
            last = node;
        }else if(i==size){
            last.next=node;
            last=node;
        }else {
           Node node1=getNode(i);
           node.next=node1;
           node.before=node1.before;
           node1.before=node;
        }

        size++;

        return obj;
    }

    public Object deleteHead(){
        if (head == null) {
            return null;
        }
        Object o=head.data;
        head=head.next;
        size--;
        return o;
    }

    public Node getNode(int i){
        if (i > size) {
            throw new IndexOutOfBoundsException("数据越界异常");
        }
        Node current=head;
        int index=0;
        while (index<i){
            current=current.next;
            index++;
        }
        return current;
    }


    public Node find(Object o){
        Node current=head;
        int tempSize=size;
        while (tempSize>0){
            if(o.equals(current.data)){
                return current;
            }else {
                current=current.next;
            }
            tempSize--;
        }
        return null;
    }




    public int getSize(){
        return size;
    }



    private static class Node{
        private Object data;
        private Node next;
        private Node before;
        public Node(Object data){
            this.data=data;
        }
    }


    public static void main(String[] args) {
        LinkListTest linkListTest=new LinkListTest();
        String s="q";
     //   Node node=new Node(s);
        linkListTest.addHead("2");
        linkListTest.addHead("1");
        linkListTest.addLast("3");
        linkListTest.addLast("4");
        linkListTest.addIndex(3,"5");
      //  System.out.println(linkListTest.getNode(3).data);
     //   Node node1=linkListTest.find(s);
    //    System.out.println((String)node1.data);
//        linkListTest.deleteHead();

    }
}
