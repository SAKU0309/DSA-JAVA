class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val=val;
        this.next=null;
    }
 }
public class Solution{
    static boolean hasCycle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while(hare!=null && hare.next!=null){
            hare = hare.next.next;
            turtle=turtle.next;
            if(hare==turtle){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        System.out.println(hasCycle(head));
    }             
}