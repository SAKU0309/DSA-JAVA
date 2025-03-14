//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/?envType=problem-list-v2&envId=linked-list
class ListNode{
    ListNode next;
    int data;

    public ListNode(int data) {
        this.data=data;
        this.next=null;
    }
    
}
public class Solution {
    static ListNode deleteDuplicates(ListNode head){
        ListNode current = head;
        if(head==null||head.next==null) return head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current .next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }
    static void print(ListNode head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        print(head);
        head = deleteDuplicates(head);
        print(head);
    }
}
