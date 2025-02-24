class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val=val;
        this.next=null;
    }
    
}
public class Solution {
            static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) return list2;
            if (list2 == null) return list1;
        
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
            }

            static void print(ListNode head) {
                ListNode temp = head;
                while(temp!=null) {
                    System.out.print(temp.val+"->");
                    temp=temp.next;
                }
                System.out.println("null");
            }

            
            public static void main(String[] args) {
                ListNode head = new ListNode(1);
                head.next = new ListNode(3);
                head.next.next = new ListNode(4);
                ListNode head1 = new ListNode(2);
                head1.next = new ListNode(5);
                head1.next.next = new ListNode(8);
                print(head);
                mergeTwoLists(head,head1);
                print(head);
            
        }
}
