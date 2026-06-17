// every node  is an object
class Node() {
    int data;
    int next;
    Node(int d) {
        this.data=d;
        this.next=null;
    }
 
}
public class llnodes {
    public ststic void main(String[] args)  {
        Node head=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        head.next=second;/* store second node reference inside next of  head
 ↓
[10|*] ----> [20|null]*/
        second.next=third;
    }
}