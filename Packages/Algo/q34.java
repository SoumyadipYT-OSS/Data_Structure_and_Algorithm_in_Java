package Algo;
/* Merge two sorted singly linked list in java */
public class q34 extends Thread
{
    private ListNode_q34 head;
    private static class ListNode_q34 {
        private int data;
        private ListNode_q34 next;
        public ListNode_q34 (int data) {
            this.data = data;
            this.next = null;
        }
    }
    // method to display linked list
    protected void display_LinkedList (ListNode_q34 head) {
        ListNode_q34 current = head;
        while (current!=null) {
            System.out.print(current.data+"->");
            current = current.next;
        } System.out.println("NULL");
    }
    // method to merge two linked list as sorted
    protected ListNode_q34 merge_LinkedList (ListNode_q34 a, ListNode_q34 b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        if (a.data < b.data) {
            a.next = merge_LinkedList(a.next,b);
            return a;
        } else {
            b.next = merge_LinkedList(a,b.next);
            return b;
        }
    }
    // method of first Linked List
    protected ListNode_q34 first_LinkedList() {
        q34 q1 = new q34();
        q1.head = new ListNode_q34(1);
        ListNode_q34 second = new ListNode_q34(4);
        ListNode_q34 third = new ListNode_q34(8);
        q1.head.next = second;
        second.next = third;
        third.next = null;
        return q1.head;
    }
    // method of second Linked List
    protected ListNode_q34 second_LinkedList() {
        q34 q2 = new q34();
        q2.head = new ListNode_q34(3);
        ListNode_q34 second = new ListNode_q34(6);
        q2.head.next = second;
        second.next = null;
        return q2.head;
    }

    // main method
    public static void main(String[] args) throws InterruptedException
    {
        q34 Q = new q34();
        System.out.println("First Linked List:");
        Q.display_LinkedList(Q.first_LinkedList());
        System.out.println("Second Linked List:");
        Q.display_LinkedList(Q.second_LinkedList());
        System.out.println("Merging two Linked List...");
        Thread.sleep(800);
        System.out.println("processing...");
        Thread.sleep(600);
        ListNode_q34 r = Q.merge_LinkedList(Q.first_LinkedList(),Q.second_LinkedList());
        Q.display_LinkedList(r);
    }
}