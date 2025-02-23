class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Solution {
    static Node deleteHead(Node head){
        if(head==null){
            return null;
        }
        head = head.next;
        return head;
    }
    static void print(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(12);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(18);
        head = deleteHead(head);
        print(head);
    }
}
