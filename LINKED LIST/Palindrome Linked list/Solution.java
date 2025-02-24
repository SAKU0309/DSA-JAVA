class ListNode{
    int val;
    ListNode next;

    ListNode(int val) {
        this.val=val;
        this.next=null;
    }
    
}
public class Solution {
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    static  ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

     static boolean isPalindrome(ListNode head) {
            if(head==null||head.next==null){
                return true;
            }
            ListNode middle = findMiddle(head);
            ListNode secondhalfstart= reverse(middle.next);
    
            ListNode firsthalfstart=head;
            while(secondhalfstart!=null){
                if(firsthalfstart.val != secondhalfstart.val){
                    return false;
                }
                firsthalfstart = firsthalfstart.next;
                secondhalfstart = secondhalfstart.next;
            }
            return true;
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
            head.next = new ListNode(2);
            head.next.next = new ListNode(2);
            head.next.next.next = new ListNode(1);
            print(head);
            System.out.println(isPalindrome(head));
}
}