//https://leetcode.com/problems/intersection-of-two-linked-lists/description/?envType=problem-list-v2&envId=linked-list
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class IntersectionLinkedList {
    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null; 

        ListNode ptrA = headA;
        ListNode ptrB = headB;

        
        while (ptrA != ptrB) {
            ptrA = (ptrA == null) ? headB : ptrA.next;
            ptrB = (ptrB == null) ? headA : ptrB.next;
        }

        return ptrA; 
    }

    
    private static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    
    public static void main(String[] args) {
        
        ListNode listA = createList(new int[]{4, 1});
        ListNode intersection = new ListNode(8);
        intersection.next = new ListNode(4);
        intersection.next.next = new ListNode(5);

        ListNode listB = createList(new int[]{5, 6, 1});

        ListNode tempA = listA;
        while (tempA.next != null) tempA = tempA.next;
        tempA.next = intersection;

        ListNode tempB = listB;
        while (tempB.next != null) tempB = tempB.next;
        tempB.next = intersection;

        ListNode result = getIntersectionNode(listA, listB);
        System.out.println("Intersection at: " + (result != null ? result.val : "No intersection"));
    }
}
