class Node {
	int data;
	Node next;
	
	Node(int newData){
		data=newData;
		next=null;
	}
}

public class Solution {
	/*
	 * length of the linked list
	 * */
	static int length(Node head) {
		if(head==null) {
			return 0;
		}
		return 1+length(head.next);
	}
	/*
	 * insertion at staring
	 * 
	 * */
	
	
	static Node insertFront(Node head,int newdata) {
		Node newnode = new Node(newdata);
		newnode.next=head;
		return newnode;
	}
	
	//printing linked list
	
	static void print(Node head) {
		while(head!=null) {
			System.out.print(head.data+"->");
			head=head.next;
		}
		System.out.println("NULL");
	}
	
	/*
	 * Insert a Node after a Given Node in Linked List
	 * 
	 * 
	 * */
	static Node insertfternode(Node head,int key,int newdata) {
		Node curr = head;
		while(curr!=null) {
			if(curr.data==key) 
				break;
			curr=curr.next;
		}
		if(curr==null) {
			System.out.println("Node not found");
			return head;
		}
		Node newnode = new Node(newdata);
		newnode.next = curr.next;
		curr.next = newnode;
		return head;
	}
	/*
	 * 
	 * Insert a node in Linked List before a given node
	 * 
	 * */
	static Node insertbefore(Node head,int key,int newdata) {
		if(head==null) {
			return null;
		}
		if(head.data==key) {
			Node newnode = new Node(newdata);
			newnode.next = head;
			return newnode;
		}
		head.next=insertbefore(head.next,key,newdata);
		return head;
	}
	/*
	 * Insert a Node At a Specific Position in Linked List
	 *
	 */
	static Node inertatposition(Node head,int pos,int data) {
		if(pos<1) {
			return head;
		}
		if(pos==1) {
			Node newNode = new Node(data);
			newNode.next = head;
			return newNode;
		}
		Node curr = head;
		for(int i=1; i<pos-1 && curr!=null; i++) {
			curr=curr.next;
		}
		if(curr==null)
			return head;
		Node newNode = new Node(data);
		newNode.next = curr.next;
		curr.next = newNode;
		return head;
	}
	/*
	 * 
	 * Insert a Node at the End of Linked List
	 * 
	 * */
	static Node insertend(Node head,int data) {
		Node newnode = new Node(data);
		if(head==null) {
			return newnode;
		}
		Node last = head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=newnode;
		return head;
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		print(head);
		
		System.out.println("\nafter insertion at front");
		int data=0;
		head = insertFront(head,data);
		print(head);
		System.out.println("length of the linked list is: "+length(head));
		
		System.out.println("\nInsert a Node after a Given Node in Linked List");
		int key = 3, newData = 6;
		head= insertfternode(head,key,newData);
		print(head);
		System.out.println("length of the linked list is: "+length(head));

		
		System.out.println("\nInsert a node in Linked List before a given node");
		head = insertbefore(head, key, newData);
		print(head);
		System.out.println("length of the linked list is: "+length(head));
		
		System.out.println("\nInsert a Node At a Specific Position in Linked List");
		int data1 = 12, pos = 2;
		head = inertatposition(head, pos, data1);
		print(head);
		System.out.println("length of the linked list is: "+length(head));
		
		System.out.println("\nInsert a Node at the End of Linked List");
		head = insertend(head, 12);
		print(head);
		System.out.println("length of the linked list is: "+length(head));
		
	}
}
