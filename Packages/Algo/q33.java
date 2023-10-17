package Algo;

public class q33 extends Thread
{
    private ListNode_q33 head;
    private static class ListNode_q33 {
        private int data;
        private ListNode_q33 next;
        public ListNode_q33 (int data) {
            this.data = data;
            this.next = null;
        }
    }
    // method to display Linked List
    protected void display_LinkedList () {
        ListNode_q33 current = head;
        while (current!=null) {
            System.out.print(current.data + "->");
        } System.out.println("NULL");
    }
    // method to remove loop from linked list
    protected void removeLoop(ListNode_q33 slowPtr) {
        q33 qq = new q33();
        ListNode_q33 temp = head;
        while (temp.next!=slowPtr.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }
    // method to detect loop in linked list
    protected void detect_Loop_in_the_LinkedList () {
        ListNode_q33 fastPointer = head;
        ListNode_q33 slowPointer = head;
        while (fastPointer!=null && fastPointer.next!=null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer==slowPointer) {
                removeLoop(slowPointer);
            }
        }
    }
    // method to create a linked list that contains a loop
    protected void createLinkedList() {
        q33 q = new q33();
        q.head = new ListNode_q33(1);
        ListNode_q33 second = new ListNode_q33(2);
        ListNode_q33 third = new ListNode_q33(3);
        ListNode_q33 fourth = new ListNode_q33(4);
        ListNode_q33 fifth = new ListNode_q33(5);
        ListNode_q33 sixth = new ListNode_q33(6);
        q.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    // main method
    public static void main(String[] args) throws InterruptedException
    {
        q33 Q = new q33();
        Q.createLinkedList();
        Q.detect_Loop_in_the_LinkedList();
        System.out.println("updating the linked list..."); Thread.sleep(600);
        Q.display_LinkedList();
    }
}