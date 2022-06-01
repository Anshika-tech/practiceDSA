//find the middle element in linked list.
class Node{
    int data;
    Node next;
    public Node(int d){
        this.data=d;
    }
}
public class LinkedList {
    Node head;
    public void push(int newdata){
        Node newNode=new Node(newdata);
        newNode.next=head;
        head=newNode;
    }
    void mid(){
        Node first=head;
        Node second=head;
        while(first!=null&&first.next!=null){
            first=first.next.next;
            second=second.next;
        }
        if(second!=null)
             System.out.println(" mid element is "+second.data+" ");
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        obj.push(1);
        obj.push(8);
        obj.push(7);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(0);
        obj.mid();
        obj.print();
    }
}
