package Algo;
/*  Delete last node of a singly linked list*/
public class q20
{
    private static ListNode_q20 head;
    private static class ListNode_q20 {
        private int data;
        private ListNode_q20 next;
        public ListNode_q20(int data) {     // constructor
            this.data=data;
            this.next=null;
        }
    }

    // method to print the linked list
    static void display_LinkedList(ListNode_q20 head) {
        ListNode_q20 current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }System.out.println("NULL");
    }

    // method to delete the last node of the singly linked list
    public ListNode_q20 delete_lastNode() {
        if (head==null || head.next==null) {
            System.out.println("Nothing to delete!");
        }
        ListNode_q20 current = head;
        ListNode_q20 previous = null;
        while (current.next!=null) {
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }

    // main method
    public static void main(String[] args) throws InterruptedException
    {
        q20 q = new q20();
        q.head = new ListNode_q20(12);
        ListNode_q20 second = new ListNode_q20(44);
        ListNode_q20 third = new ListNode_q20(16);
        ListNode_q20 fourth  = new ListNode_q20(26);
        // connecting all nodes
        q.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
        System.out.println("__Linked List__");
        q.display_LinkedList(q.head);
        System.out.println("Deleting last node of the linked list...");
        Thread.sleep(2200);
        q.delete_lastNode();
        System.out.println("Successfully deleted!!!");
        System.out.println("__Updated Linked List__");
        Thread.sleep(1500);
        q.display_LinkedList(q.head);
    }
}