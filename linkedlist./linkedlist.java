class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

class LinkedList{
    Node head;

    void insert(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node curr=head;

        while(curr.next!=null){
            curr=curr.next;
        }

        curr.next=newNode;
    }

    void print(){
        Node curr=head;

        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
public class linkedlist{
    public static void main(String[] args){

        LinkedList list=new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.print();
    }
}