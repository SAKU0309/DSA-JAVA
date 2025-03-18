class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {
/*
 *  delete at start
 */
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
    /*
     * Delete a Linked List node at a given position
     */
    static Node deleteatposition(Node head,int position){
        Node temp=head;
        Node prev=null;
        if(temp==null){
            return head;
        }
        if(position==1){
            head=temp.next;
            return head;
        }
        for (int i = 1; temp != null && i < position; i++){
            prev = temp;
            temp=temp.next;
        }
        if (temp != null) {
            prev.next = temp.next;
        }
        else{
            System.out.println("data not found");
        }
        return head;  
    }
    /*
     * Deletion at the End of Linked List
    */
    static Node deleteatend(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node secondlastnode = head;
        while(secondlastnode.next.next!=null){
            secondlastnode=secondlastnode.next;
        }
        secondlastnode.next=null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(12);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(18);
        print(head);
        head = deleteHead(head);
        print(head);
        head = deleteatposition(head, 3);
        print(head);
        head = deleteatend(head);
        print(head);
    }
}
