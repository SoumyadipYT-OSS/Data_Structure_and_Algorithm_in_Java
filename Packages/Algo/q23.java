package Algo;
/*  How to reverse a singly linked list */
public class q23
{
    private static ListNode_q23 head;
    private static class ListNode_q23 {
        private int data;
        private ListNode_q23 next;
        public ListNode_q23(int data) {     // constructor
            this.data=data;
            this.next=null;
        }
    }

    // method to display singly linked list
    static void display_LinkedList (ListNode_q23 head) {
        ListNode_q23 current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }System.out.println("NULL");
    }

    // method to reverse the linked list
    public static ListNode_q23 reverese_linkedList(ListNode_q23 head) {
        if (head==null) {
            return head;
        }
        ListNode_q23 current=head;
        ListNode_q23 prev = null;
        ListNode_q23 next = null;
        while (current!=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    // main method
    public static void main(String[] args) throws InterruptedException
    {
        q23 q = new q23();
        q.head = new ListNode_q23(45);
        ListNode_q23 second = new ListNode_q23(57);
        ListNode_q23 third = new ListNode_q23(21);
        ListNode_q23 fourth  = new ListNode_q23(36);
        // connecting all nodes
        q.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
        System.out.println("__Created Linked List__");
        q.display_LinkedList(q.head);
        System.out.println("\nReversing the linked list...");
        Thread.sleep(2200);
        q.display_LinkedList(q.reverese_linkedList(q.head));
    }
}