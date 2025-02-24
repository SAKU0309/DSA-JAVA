class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist {
    static Node reverse(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node prevnode = null;
        Node currnode = head;
        while (currnode != null) {
            Node nextnode = currnode.next;
            currnode.next = prevnode;
            prevnode = currnode;
            currnode = nextnode;
		}
		return prevnode;
	}
	
	
	
	static void print(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(3);
		head.next.next = new Node(4);
		print(head);
		reverse(head);
		print(head);
		
	}
}

