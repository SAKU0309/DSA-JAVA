class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class Solution {
    static ListNode removeNthFromEnd(ListNode head, int n) {
            if(head.next==null){
                return null;
            }
            int size=0;
            ListNode curr=head;
            while(curr!=null){
                curr=curr.next;
                size++;
            }
            if(n==size){
                return head.next;
            }
            int indextosearch=size-n;
            ListNode prev = head;
            int i=1;
            while(i<indextosearch){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return head;
        }
        static void print(ListNode head) {
            ListNode temp = head;
            while(temp!=null) {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
            ListNode head = new ListNode(2);
            head.next = new ListNode(4);
            head.next.next = new ListNode(6);
            head.next.next.next = new ListNode(8);
            head.next.next.next.next = new ListNode(10);
            print(head);
            removeNthFromEnd(head,2);
            print(head);
    }
}

